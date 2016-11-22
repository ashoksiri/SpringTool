package com.msr.spring.dao;

import java.util.List;

import com.msr.spring.dto.User;


public interface UserDao {

	void saveUser(User user);
    
    List<User> findAllUsers();
     
    void deleteUserBySsn(String ssn);
     
    User findBySsn(String ssn);
     
    void updateUser(User User);
}
