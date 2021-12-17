package com.murtaza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murtaza.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

	public User findByUsername(String username);
}
