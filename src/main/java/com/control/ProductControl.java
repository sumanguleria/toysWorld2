package com.control;
import com.dao.ProductDao;
import com.google.gson.Gson;
import com.model.*;

import java.awt.SystemColor;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;

@Controller
public class ProductControl {


	@Autowired
	ProductDao dao;
	
//	 @RequestMapping("/Product")  
//	    public ModelAndView viewProduct(){  
//	        List<Product> list=dao.addProduct();
//	        return new ModelAndView("Product","list",list);  
//	    } 
	
	
	
	
	// ---List ---------------to JSON  Conversion
	
	
	 @RequestMapping("/Product")  
	    public String viewProduct(Model m){  
        List<Product> list=dao.addProduct();
        Gson  g= new  Gson();
       String json= g.toJson(list);
       m.addAttribute("proList", json);
        return "Product";  
	    } 
//	
	
	
//	 @RequestMapping("/Product") 
//	public @ResponseBody
//    List viewProduct(){  
//        List<Product> list=dao.addProduct();
//        System.out.println(list);
//        return list;
//    } 

//	 @RequestMapping(value="", method = RequestMethod.POST)
//	  public @ResponseBody Person post( @RequestBody final  Person person) {	
//	  	
//	      System.out.println(person.getId() + " " + person.getName());
//	      return person;
//	  }
//	 
	

}
