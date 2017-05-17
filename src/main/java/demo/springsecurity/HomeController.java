package demo.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
	public ModelAndView welcomePage(){	
		System.out.println("in controller");
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring security demo");
		model.addObject("message", "this is welcome page");
		model.setViewName("hello");
		return model;
		
	}
	
	
	@RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
	public ModelAndView admin(){	
		System.out.println("in controller");
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring security demo");
		model.addObject("message", "this is proteted ADMIN page");
		model.setViewName("admin");
		return model;
		
	}

	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout){	
		System.out.println("in login controller");
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");
		return model;
		
	}
}
