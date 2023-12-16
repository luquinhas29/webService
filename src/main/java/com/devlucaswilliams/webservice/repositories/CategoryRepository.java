package com.devlucaswilliams.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.devlucaswilliams.webservice.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
