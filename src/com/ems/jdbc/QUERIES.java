package com.ems.jdbc;

public interface QUERIES {
	
	String INSERT_INTO_USER = "insert into user (username, name, email, password) values (?,?,?,?)";
    String GET_USER_BY_USER_NAME = "select * from user where username = ?";
    
    
}
