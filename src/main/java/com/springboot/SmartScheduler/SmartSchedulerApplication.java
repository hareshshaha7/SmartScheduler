package com.springboot.SmartScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.SmartScheduler.domain.Employee;
import com.springboot.SmartScheduler.domain.User;

@SpringBootApplication
public class SmartSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartSchedulerApplication.class, args);
//		User user = new User("", "", "", 0);
		Employee employee = new Employee();
	}

}
