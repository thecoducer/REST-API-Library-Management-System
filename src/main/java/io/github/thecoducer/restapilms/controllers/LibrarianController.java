package io.github.thecoducer.restapilms.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.thecoducer.restapilms.models.Users;
import io.github.thecoducer.restapilms.services.LibrarianService;

@RestController
@RequestMapping("/v1/librarian/")
public class LibrarianController {
	
	@Autowired
	LibrarianService librarianService;
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getUsersList(@RequestParam(required = false) Boolean showDisabled){ 
		return librarianService.getUsersList(showDisabled);
	}

}
