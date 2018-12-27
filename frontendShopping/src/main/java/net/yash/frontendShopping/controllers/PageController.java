package net.yash.frontendShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.yash.backendShopping.dao.CategoryDAO;
import net.yash.backendShopping.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mvObject = new ModelAndView("page");
		mvObject.addObject("title", "home");
		mvObject.addObject("userClickHome", true);
		mvObject.addObject("categories", categoryDAO.list() );
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
	
	@RequestMapping(value = {"/show/all/productsList"})
	public ModelAndView allProductsList(){
		ModelAndView mvObject = new ModelAndView("page");
		mvObject.addObject("title", "productsList");
		mvObject.addObject("categories",categoryDAO.list());
		mvObject.addObject("userClickAllProducts", true);
		return mvObject;
	}
	
	@RequestMapping(value={"/show/category/{id}/products"})
	public ModelAndView categoryProduct(@PathVariable("id") int id){
		ModelAndView mvObject = new ModelAndView("page");
		// Fetching that particular category products
		Category category = null;
		category = categoryDAO.get(id);
		mvObject.addObject("title", category.getName());
		mvObject.addObject("category", category);
		// also passing the list of categories as well.
		mvObject.addObject("categories", categoryDAO.list());
		mvObject.addObject("userClickCategoryProduct", true);
		return mvObject;
	}
	
}
