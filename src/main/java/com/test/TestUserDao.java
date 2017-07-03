package com.test;

import com.DAO.UserDao;
import com.model.User;

public class TestUserDao {
public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setName("hani");
		user.setUsername("hanishamadhu");
		user.setPassword("chocolate");
		user.setMobileNo(938049383);
		user.setEmailid("han@gmail.com");
		user.setActive("yes");
		user.setRole("user");
		
		UserDao userDAO = new UserDao();
		
		
		try {
			userDAO.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			userDAO.loginUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			userDAO.updatePassword(user, "milky");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
