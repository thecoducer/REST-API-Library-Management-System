package io.github.thecoducer.restapilms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.thecoducer.restapilms.models.Users;
import io.github.thecoducer.restapilms.repositories.UsersRepository;

@Service
public class LibrarianService {
	
	@Autowired
	UsersRepository usersRepository;
	
	public ResponseEntity<List<Users>> getUsersList(Boolean showDisabled) {
		
		List<Users> usersList;
		
		try {
			if(showDisabled == true) {
				usersList = usersRepository.findAllDisabledUsers();
			}else {
				usersList = usersRepository.findAllActiveUsers();
			}
		} catch (NullPointerException e) {
			usersList = usersRepository.showAllUsers();
		}
		
		return new ResponseEntity<List<Users>>(usersList, HttpStatus.OK);
	}

}
