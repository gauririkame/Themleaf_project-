package com.example.Thymeleaf_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserRespository userRespository;
	
	@RequestMapping("/")    
	public String index()  
	{    
	return"index";    
	}  
	
	
	
	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute UserEntity userEntity)  
	{  
	 userRespository.save(userEntity); //to save entries in db 
	ModelAndView modelAndView = new ModelAndView();    
	modelAndView.setViewName("user-data");        
	modelAndView.addObject("userEntity", userEntity);      
	return modelAndView; 
	
	
	  //return new ModelAndView("redirect:/edit/" + userEntity.getUserid());
	} 
	
	/*

	 @RequestMapping(value="/delete", method=RequestMethod.POST)    
	public ModelAndView delete(@ModelAttribute UserEntity userEntity)  
	{  
	   userRespository.delete(userEntity);  // To delete the entity from the database
	   
	   ModelAndView modelAndView = new ModelAndView();    
	   modelAndView.setViewName("delete");  // Redirect to the same page or any other page
	   modelAndView.addObject("message", "User deleted successfully");
	   
	   return modelAndView;    
	}
	*/
	/*
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editUser(@PathVariable("id") Long id) {
	    // Fetch the existing user entity by ID
	    UserEntity userEntity = userRespository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user ID:" + id));

	    // Pass the fetched data to the view
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("edit-user"); // This will be the template for the update form
	    modelAndView.addObject("userEntity", userEntity);
	    return modelAndView;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateUser(@ModelAttribute UserEntity userEntity) {
	    // Save the updated user entity
	    userRespository.save(userEntity); // This will update the existing entry if the ID exists

	    // Redirect to the user data view after update
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("user-data");
	    modelAndView.addObject("userEntity", userEntity); // Updated data
	    return modelAndView;
	}
	*/


	

}
