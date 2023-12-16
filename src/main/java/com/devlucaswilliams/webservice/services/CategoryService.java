package com.devlucaswilliams.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucaswilliams.webservice.entities.Category;
import com.devlucaswilliams.webservice.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		List<Category> list = categoryRepository.findAll();
		return list;
	}
	
	public Category findById(Long id){
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
