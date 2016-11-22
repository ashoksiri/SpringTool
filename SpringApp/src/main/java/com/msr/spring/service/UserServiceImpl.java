package com.msr.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msr.spring.dao.UserDao;
import com.msr.spring.dto.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao dao;
     
    public void saveUser(User employee) {
        dao.saveUser(employee);
    }
 
    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }
 
    public void deleteUserBySsn(String ssn) {
        dao.deleteUserBySsn(ssn);
    }
 
    public User findBySsn(String ssn) {
        return dao.findBySsn(ssn);
    }
 
    public void updateUser(User employee){
        dao.updateUser(employee);
    }

}
