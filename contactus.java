package com.company.varnaa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hospital")
public class contactus {
public contactus() {
		super();
		// TODO Auto-generated constructor stub
	}
public contactus(int id, String firstname, String lastname, String email, Long phone, String message) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}
@Override
	public String toString() {
		return "contactus [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phone=" + phone + ", message=" + message + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String firstname;
private String lastname;

private String email;
private Long phone;
private String message;


	
	
}
