package com.cts.Academy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Academy.bean.Login;

public class AdminController {
	
	
	@RequestMapping(value="deleteProduct.html")
	public ModelAndView getDeleteProduct(@RequestParam("id") String id){
		ModelAndView mav= new ModelAndView();
		mav.setViewName("Admin-ListProducts");
	//	String s=productService.deleteProduct(id);
		List<Product> product= productService.getAllProducts();
		mav.addObject("product",product);
		return mav;
	}
	
	@RequestMapping(value="Add-Product.html",method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product, HttpSession httpSession){
		String s=productService.addProduct(product);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-ListProducts");
		modelAndView.addObject("products",productService.getAllProducts());
		}
		else{
			modelAndView.setViewName("Admin-AddProduct");
		}
		
		
		return modelAndView;
	}
}
