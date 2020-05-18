package io.github.thecoducer.restapilms.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import io.github.thecoducer.restapilms.services.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsServiceImpl userDetailsService;
	
	// WebSecurityConfigurerAdapter class in Spring has a configure method
	// that we need to override to have our own security configurations
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/v1/librarian/*").hasRole("LIBRARIAN")
		.antMatchers("/student/").hasAnyRole("STUDENT", "LIBRARIAN")
		.antMatchers("/teacher/").hasAnyRole("TEACHER", "LIBRARIAN")
		.antMatchers("/").permitAll()
		.and()
		.formLogin();
		
		// The default cookie name searched for is XSRF-TOKEN, and the default 
		// header name returned is X-XSRF-TOKEN. Spring security provides a way of 
		// storing the CSRF token in the cookie as required by swagger with the configuration below
		http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	}

}
