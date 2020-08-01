package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import com.example.demo.model.Customer;
import com.example.demo.repository.Repo;
import java.util.List;
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;  
import com.example.demo.exception.ResourceNotFoundException;
@RestController
public class MainController {
@Autowired    
Repo repository;

@PostMapping("/create")
public Customer create(@RequestBody Customer cust) {    
    return repository.save(cust);
}
@GetMapping("/see")
public List<Customer> getAllNotes() {
	List<Customer>userRecords = new ArrayList<>();    
repository.findAll().forEach(userRecords::add);    
return userRecords;    

}
@DeleteMapping("/delete/{id}")
public void Del(@PathVariable String id) {    
		Long userId = Long.parseLong(id);
		if(repository.findById(userId).isPresent())
		repository.deleteById(userId);
}

@PutMapping("/put/{id}")
public Customer Putt(@PathVariable String id,@RequestBody Customer cust) {    	
		//bookRepository.findById(id)-> exxception handle here if the id not present
		Long userId = Long.parseLong(id);
		 Customer n=repository.findById(userId)
		 .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", userId));		 
		 if(cust.getFirstName()!=null)
		 n.setFirstName(cust.getFirstName());
		 if(cust.getLastName()!=null)
		 n.setLastName(cust.getLastName());
		 if(cust.getEmail()!=null)
		 n.setEmail(cust.getEmail());
		if(cust.getDateOfBirth()!=null)
		 n.setDateOfBirth(cust.getDateOfBirth());
		if(cust.getPhoneNumber()!=null)
		 n.setPhoneNumber(cust.getPhoneNumber());
		if(cust.getAddress()!=null)
		 n.setAddress(cust.getAddress());
		 repository.save(n);
		 return n;
}
}                                                                                                           