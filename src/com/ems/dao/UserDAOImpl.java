package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ems.domain.User;
import com.ems.jdbc.ConnectionFactory;
import com.ems.jdbc.QUERIES;

public class UserDAOImpl implements UserDAO{

	@Override
	public User getUserByUserName(String username) {
		
		Connection conn = ConnectionFactory.getConnection();
		User user = null;

		try
		{
			PreparedStatement ps = conn.prepareStatement(QUERIES.GET_USER_BY_USER_NAME);
			ps.setString(1, username);

			ResultSet rs=  ps.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					String userId = rs.getString(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String password = rs.getString(4);

					user = new User();

					user.setUsername(username);
					user.setEmail(email);
					user.setPassword(password);
					user.setName(name);

				}

			}

		}
		catch(Exception e)
		{
			System.out.println("Exception occured while fecthing the user details for user :"+ username + e);
		}

		return user;
	}

	@Override
	public void saveUser(User user) {

		Connection conn = ConnectionFactory.getConnection();
		try
		{
			PreparedStatement ps = conn.prepareStatement(QUERIES.INSERT_INTO_USER);

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());


			int n =  ps.executeUpdate();

			System.out.println("Number of records inserted into db : "+ n);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while saving the user, "+ user + ": "+ user);
		}



	}

}
