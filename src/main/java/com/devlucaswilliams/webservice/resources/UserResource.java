package com.devlucaswilliams.webservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucaswilliams.webservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		User user = new User(1L, "Lucas", "lucas@gmail.com", "81996595778", "1234");
		User user1 = new User(2L, "Lucas", "lucas@gmail.com", "81996595778", "1234");
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);
		return ResponseEntity.ok().body(list);
	}

}
