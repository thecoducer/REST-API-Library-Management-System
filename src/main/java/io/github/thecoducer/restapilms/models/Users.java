package io.github.thecoducer.restapilms.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "username")
	private String userName;
	
	private String email;
	
	private String password;
	
	@Column(name = "fname")
	private String fullName;
	
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	private enum Authority {
		ROLE_STUDENT, ROLE_TEACHER, ROLE_LIBRARIAN;
	}
	@Enumerated(EnumType.STRING)
	private Authority authority;
	
	private boolean enabled;
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getAuthority() {
		return authority.toString();
	}

	public void setAuthority(String authority) {
		this.authority = Authority.valueOf(authority);
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", fullName=" + fullName + ", createdAt=" + createdAt + ", authority=" + authority + ", enabled="
				+ enabled + "]";
	}
	
}
