package io.github.thecoducer.restapilms.models;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsObj implements UserDetails{
	
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String fullName;
	private String createdAt;
	private List<GrantedAuthority> authority;
	
	private boolean enabled;
	
	public UserDetailsObj(Users user) {
		this.userId = user.getUserId();
		this.userName = user.getUserName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.fullName = user.getFullName();
		this.createdAt = user.getCreatedAt();
		this.authority = Arrays.asList((new SimpleGrantedAuthority(user.getAuthority())));
		this.enabled = user.isEnabled();
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authority;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public String toString() {
		return "UserDetailsObj [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password="
				+ password + ", fullName=" + fullName + ", createdAt=" + createdAt + ", authority=" + authority
				+ ", enabled=" + enabled + "]";
	}

}
