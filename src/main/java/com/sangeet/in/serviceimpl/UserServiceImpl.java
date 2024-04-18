package com.sangeet.in.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangeet.in.entity.User;
import com.sangeet.in.repository.UserRepository;
import com.sangeet.in.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrep;
	
	public UserServiceImpl(UserRepository userrep) {
		this.userrep=userrep;
	}
	
	
	@Override
	public User addUser(User theUser) {
		return userrep.save(theUser);
	}

	@Override
	public User updateUser(User theUser) {
		return userrep.save(theUser);
	}

	@Override
	public List<User> getAllUser() {
		return userrep.findAll();
	}

	@Override
	public void deleteUserById(int id) {
		User u = userrep.getReferenceById(id);
		userrep.delete(u);
		
	}

}
