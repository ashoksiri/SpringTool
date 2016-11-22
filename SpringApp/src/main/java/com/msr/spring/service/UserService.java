package com.msr.spring.service;

import java.util.List;

import com.msr.spring.dto.User;

public interface UserService {

	 void saveUser(User employee);
	 
	    List<User> findAllUsers();
	 
	    void deleteUserBySsn(String ssn);
	 
	    User findBySsn(String ssn);
	 
	    void updateUser(User employee);
}
