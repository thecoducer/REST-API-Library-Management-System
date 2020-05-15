package io.github.thecoducer.restapilms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.thecoducer.restapilms.models.UserDetailsObj;
import io.github.thecoducer.restapilms.models.Users;
import io.github.thecoducer.restapilms.repositories.UsersRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UsersRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Users> user = userRepository.findByUserName(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not found" + userName));
		
		return user.map(UserDetailsObj::new).get();
	}
	
}
