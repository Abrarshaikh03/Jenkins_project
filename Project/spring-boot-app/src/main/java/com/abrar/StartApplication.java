package com.abrar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    // Home route that renders the main page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to the Spring Boot Website!");
        model.addAttribute("msg", "This application has been successfully deployed using Spring Boot, Maven, Kubernetes and Argo CD.");
        return "index"; // Returns index.html (Thymeleaf template)
    }

    // Additional route for a sample 'about' page
    @GetMapping("/about")
    /*public String about(Model model) {
        model.addAttribute("title", "About Us");
        model.addAttribute("msg", "This application demonstrates the use of Spring Boot and Kubernetes for deployment.");
        return "about"; // Returns about.html (Thymeleaf template)
    }*/

    // Main method to launch the application
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
