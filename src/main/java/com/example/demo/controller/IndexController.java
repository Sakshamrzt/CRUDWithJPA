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
@Controller
public class IndexController {
@Value("${spring.application.name}")
 String appName;

@GetMapping("/")
public String homePage(Model model) {
    model.addAttribute("appName", appName);
 return "home";   
}

}                                                                                                           