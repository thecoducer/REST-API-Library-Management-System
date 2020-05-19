package io.github.thecoducer.restapilms.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.github.thecoducer.restapilms.models.NewUser;
import io.github.thecoducer.restapilms.models.Users;
import io.github.thecoducer.restapilms.repositories.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UsersRepository usersRepository;

	public ResponseEntity<Map<String, String>> createNewUser(NewUser newUser) {
		
		System.out.println("New User: " + newUser);
		
		Map<String, String> response = new TreeMap<String, String>();
		
		String userName = newUser.getUserName();
		String fullName = newUser.getFullName();
		String email = newUser.getEmail();
		String password = newUser.getPassword();
		String authority = newUser.getAuthority();
		
		// check if fields are blank or not
		if(userName.isEmpty() || fullName.isEmpty() || email.isEmpty() || password.isEmpty()) {
			response.put("message", "One or more fields are empty.");
			return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
		}
		
		// if email address already exists
		if(usersRepository.findByEmail(email).isEmpty() == false) {
			response.put("message", "There already exists a user with the same email address.");
			return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
		}
		
		// if username already exists
		if(usersRepository.findByUserName(userName).isEmpty() == false) {
			response.put("message", "username already exists.");
			return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
		}
		
		// create an instance of User class
		Users user = new Users();
		
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		user.setFullName(fullName);
		
		// get current date and time
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		
		user.setCreatedAt(df.format(dateobj));
		
		try {
			user.setAuthority(authority);
		}catch (IllegalArgumentException e) {
			response.put("message", "The authority field must be ROLE_STUDENT, ROLE_TEACHER or ROLE_LIBRARIAN.");
			return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
		}
		
		
		if(authority.equals("ROLE_LIBRARIAN") == true) {
			user.setEnabled(true);
		}else {
			user.setEnabled(false);
		}
		
		System.out.println(user);
		
		usersRepository.save(user);
		
		response.put("message", "Created new user successfully.");
		response.put("username", userName);
		response.put("authority", authority);
		
		return new ResponseEntity<Map<String,String>>(response, HttpStatus.OK);
		
	}

}
