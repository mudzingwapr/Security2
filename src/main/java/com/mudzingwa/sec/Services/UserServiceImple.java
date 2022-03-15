package com.mudzingwa.sec.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.sec.Repositories.UserRepositories;
import com.mudzingwa.sec.model.User;
@Service
public class UserServiceImple implements IUserServiceInterf {

	@Autowired
	private UserRepositories repo;
	
	@Override
	public Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteUser(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User UpdateUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
