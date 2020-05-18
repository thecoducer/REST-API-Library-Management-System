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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/v1/librarian/")
@Api(tags = "Endpoints exclusive to Librarian")
public class LibrarianController {
	
	@Autowired
	LibrarianService librarianService;
	
	@GetMapping("/users")
	@ApiOperation(value = "Get List of Users")
	public ResponseEntity<List<Users>> getUsersList(@RequestParam(required = false) Boolean showDisabled){ 
		return librarianService.getUsersList(showDisabled);
	}

}
