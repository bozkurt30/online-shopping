package net.chn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("deneme", " Spring Web MVC Hoþgeldiniz");
		return mv;
	}

}
