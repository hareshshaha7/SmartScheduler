package com.springboot.SmartScheduler.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Table(name = "user")
@UniqueConstraint(columnNames = {"email_id"})
public class User {
	@Getter 
	@Setter	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Getter 
	@Setter
	@NonNull
	@Column(name = "first_name")
	private String firstName;
	
	@Getter 
	@Setter
	@Column(name = "last_name")
	private String lastName;
    
	@Getter 
	@Setter
	@NonNull
	@Column(name = "email_id")
	private String emailId;
    
	@Getter 
	@Setter
	@Column(name = "contact_number")
	private long contactNumber;

//	public User() {
//		this.firstName = null;
//		this.lastName = null;
//		this.emailId = null;
//		this.contactNumber = 0;
//	}
//	
//	public User(String firstName, String lastName, String emailId, long contactNumber) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.emailId = emailId;
//		this.contactNumber = contactNumber;
//	}
}
