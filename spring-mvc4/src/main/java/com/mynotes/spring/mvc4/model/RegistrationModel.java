package com.mynotes.spring.mvc4.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.mynotes.spring.mvc4.utils.Phone;

public class RegistrationModel {

	@Size(min=2, max=30)
	private String fname;

	@Size(min=2, max=30)
	private String lname;
	
	@NotEmpty @Email
	private String email;
	
	@NotEmpty @Phone
	private String phone;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "RegistrationModel [fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone + "]";
	}

}
