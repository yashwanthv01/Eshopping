package net.yash.frontendShopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mvObject = new ModelAndView("page");
		mvObject.addObject("greeting", "Welcome to Eshopping website !!");
		return mvObject;
	}
	
	@RequestMapping(value="/test")
	public ModelAndView testRequestParam(@RequestParam("greeting") String greeting,
										@RequestParam("secondGreeting")String secondGreeting){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		mv.addObject("secondGreeting", secondGreeting);
		return mv;
	}

	@RequestMapping(value="/test/{greeting}")
	public ModelAndView testPathParam(@PathVariable("greeting")String greeting){
		ModelAndView mvObject = new ModelAndView("pathGreeting");
		mvObject.addObject("greeting", greeting);
		return mvObject;	
	}
}
