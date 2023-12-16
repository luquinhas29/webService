package com.devlucaswilliams.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucaswilliams.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
