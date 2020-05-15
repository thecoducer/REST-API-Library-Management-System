package io.github.thecoducer.restapilms.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserDetailsService userDetailsService;
	

	// WebSecurityConfigurerAdapter class in Spring has the configure method
	// that we need to override to have my own security configurations

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//		auth.jdbcAuthentication()
//		.dataSource(dataSource)
//		.usersByUsernameQuery("select username, password, enabled from users where username = ?")
//		.authoritiesByUsernameQuery("select username, authority from users where username = ?");
		
		auth.userDetailsService(userDetailsService);		

	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/librarian").hasRole("LIBRARIAN")
		.antMatchers("/student").hasAnyRole("STUDENT", "LIBRARIAN")
		.antMatchers("/teacher").hasAnyRole("TEACHER", "LIBRARIAN")
		.antMatchers("/").permitAll()
		.and()
		.formLogin();

	}

}
