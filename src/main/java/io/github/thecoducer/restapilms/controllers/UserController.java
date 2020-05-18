package io.github.thecoducer.restapilms.controllers;

import java.security.Principal;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.thecoducer.restapilms.models.NewUser;
import io.github.thecoducer.restapilms.models.Users;
import io.github.thecoducer.restapilms.services.UserService;

@RestController
@RequestMapping("/v1/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getcurrentuser")
	public ResponseEntity<Map<String, String>> getUser(Principal currentUser) {
		Map<String, String> userInfo = new TreeMap<>();
		userInfo.put("User info", currentUser.toString());
		
		return new ResponseEntity<Map<String, String>>(userInfo, HttpStatus.OK);
	}
	
	@GetMapping("/getcsrftoken")
	public String getCSRFtoken(HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
		return token.getToken();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ResponseEntity<Map<String, String>> createNewUser(@RequestBody NewUser newUser) {
		return userService.createNewUser(newUser);
	}
	
}
