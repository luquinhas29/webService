package com.devlucaswilliams.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.devlucaswilliams.webservice.entities.User;
import com.devlucaswilliams.webservice.repositories.UserRepository;
import com.devlucaswilliams.webservice.services.exceptions.DataBaseException;
import com.devlucaswilliams.webservice.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));

	}
	
	public User insert(User obj) {
		obj = userRepository.save(obj);
		return obj;
	}
	
	public void delete(Long id) {
		try {
		userRepository.deleteById(id);
	}catch (EmptyResultDataAccessException e) {
		throw new ResourceNotFoundException(id);
	}catch(DataIntegrityViolationException e) {
		throw new DataBaseException(e.getMessage());
	}
}

	public User update(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, obj);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
