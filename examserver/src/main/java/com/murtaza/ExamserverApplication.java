package com.murtaza;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.murtaza.model.Role;
import com.murtaza.model.User;
import com.murtaza.model.UserRole;
import com.murtaza.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("code started");
		
		User user = new User();
		user.setFirstName("David");
		user.setLastName("Beckham");
		user.setUsername("david12");
		user.setPassword("d@vid");
		user.setEmail("david12@gmail.com");
		user.setProfile("default.png");
		
		Role role1= new Role();
		role1.setRoleId(43L);
		role1.setRoleName("ADMIN");
		
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());
		
		
	}
	
	

}
