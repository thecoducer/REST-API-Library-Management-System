package io.github.thecoducer.restapilms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/student")
	public String student() {
		return ("<h1>Student</h1>");
	}
	
	@GetMapping("/librarian")
	public String librarian() {
		return ("<h1>Librarian</h1>");
	}
	
	@GetMapping("/teacher")
	public String teacher() {
		return ("<h1>Teacher</h1>");
	}
}
