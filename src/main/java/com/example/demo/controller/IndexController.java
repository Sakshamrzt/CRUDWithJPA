package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import com.example.demo.model.Customer;
import com.example.demo.repository.Repo;
import java.util.List;
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
@RestController
public class IndexController {
@Autowired    
Repo repository;
    @Value("${spring.application.name}")
	     String appName;
	 
	    @GetMapping("/")
	    public String homePage(Model model) {
	        model.addAttribute("appName", appName);
	        repository.save(new Customer("Jack", "Bauer"));
	     return "home";   
	    }
	      @GetMapping("/see")
	      public List<Customer> getAllNotes() {
	  		List<Customer>userRecords = new ArrayList<>();    
			repository.findAll().forEach(userRecords::add);    
			return userRecords;    

	    }
}                                                                                                           