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
		mvObject.addObject("title", "home");
		mvObject.addObject("userClickHome", true);
		return mvObject;
	}
	
	@RequestMapping(value = {"/product"})
	public ModelAndView productMethod(){
		ModelAndView mvObject = new ModelAndView("page");
		mvObject.addObject("title", "product");
		mvObject.addObject("userClickProduct", true);
		return mvObject;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView aboutMethod(){
		ModelAndView mvObject = new ModelAndView("page");
		mvObject.addObject("title", "about");
		mvObject.addObject("userClickAbout", true);
		return mvObject;
	}
	@RequestMapping(value = {"/contact"})
	public ModelAndView contactMethod(){
		ModelAndView mvObject = new ModelAndView("page");
		mvObject.addObject("title", "contact");
		mvObject.addObject("userClickContact", true);
		return mvObject;
	}
	
}
