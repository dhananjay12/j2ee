package com.mynotes.j2ee.history;

public class Authenticator {

	public String authenticate(String username, String password) {
		if (("admin".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}