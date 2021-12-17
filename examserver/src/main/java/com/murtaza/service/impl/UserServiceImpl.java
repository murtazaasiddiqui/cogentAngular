package com.murtaza.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murtaza.model.User;
import com.murtaza.model.UserRole;
import com.murtaza.repository.RoleRepository;
import com.murtaza.repository.UserRepository;
import com.murtaza.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local=this.userRepository.findByUsername(user.getUsername());
		
		if(local!=null) {
			System.out.println("User is already there!!");
		}else {
			//user create
			for(UserRole ur: userRoles) {
				roleRepository.save(ur.getRole());
			}
		user.getUserRoles().addAll(userRoles);
		local=this.userRepository.save(user);
		}
			return local;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
		
	}
	
	
	
	
	
}
