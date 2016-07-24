package com.ems.dao;

import com.ems.domain.User;

public interface UserDAO {
	
	User getUserByUserName(String username);
	void saveUser(User user);

}
