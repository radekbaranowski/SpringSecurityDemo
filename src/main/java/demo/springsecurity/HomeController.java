package demo.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		model.addObject("message", "this is ADMIN page");
		model.setViewName("admin");
		return model;
		
	}

}
