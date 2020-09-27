package com.springboot.SmartScheduler.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "skill")
@UniqueConstraint(columnNames = {"name"})
public class Skill {
	@Getter 
	@Setter	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Getter 
	@Setter
	@NonNull
	private String name;

//	public Skill() {
//		this.name = null;
//	}
//	public Skill(String name) {
//		this.name = name;
//	}
	
}
