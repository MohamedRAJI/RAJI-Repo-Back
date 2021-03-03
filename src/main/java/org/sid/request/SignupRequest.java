package org.sid.request;

import java.util.Set;

public class SignupRequest {
	
	private String username;
    private String password;
    private String email;
    private Set<String> role;
	public SignupRequest(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Set<String> getRole() {
		return role;
	}



}
