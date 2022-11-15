package com.jpa.test;
import com.jpa.test.entities.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepositeoy;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		 ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		 UserRepositeoy userRepositeoy=context.getBean(UserRepositeoy.class);
		 User user= new User();
		 user.setName("RAQUIF ROSHAN RAZDAN");
		 user.setCity("NOIDA");
		 user.setStatus("I Am Java Programmer...");
		 
		 User user1= userRepositeoy.save(user);
		 System.out.println(user1);
		 
	
		 
		 
		 
	}

}
