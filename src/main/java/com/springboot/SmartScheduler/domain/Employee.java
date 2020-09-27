package com.springboot.SmartScheduler.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
	@Getter 
	@Setter	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Getter
	@Setter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name = "user_id")
	private User user;
	
	@Getter
	@Setter
	private List<Skill> skills;
	
	@Getter
	@Setter
	private String experience;

//	public Employee() {
//		this.user = new User();
//		this.skills = new ArrayList<Skill>();
//		this.experience = null;
//	}
//
//	public Employee(User user, List<Skill> skills, String experience) {
//		this.user = user;
//		this.skills = skills;
//		this.experience = experience;
//	}
//	
//	public Employee(String firstName, String lastName, String emailId, long contactNumber, List<Skill> skills, String experience) {
//		this.user = new User(firstName, lastName, emailId, contactNumber);
//		this.skills = skills;
//		this.experience = experience;
//	}
}
