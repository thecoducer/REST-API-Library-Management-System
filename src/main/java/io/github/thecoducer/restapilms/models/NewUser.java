package io.github.thecoducer.restapilms.models;

public class NewUser {
	
	private String userName;
	private String email;
	private String password;
	private String fullName;
	private String createdAt;
	private String authority;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String toString() {
		return "NewUser [userName=" + userName + ", email=" + email + ", password=" + password + ", fullName="
				+ fullName + ", createdAt=" + createdAt + ", authority=" + authority + "]";
	}
	
}
