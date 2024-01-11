package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.UserRepository;
import com.educandoweb.course.entities.User_App;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User_App> findAll(){
		return repository.findAll();
	}

	public User_App findById(Long id) {
		Optional<User_App> obj = repository.findById(id);
		return obj.get();
	}
	
}
