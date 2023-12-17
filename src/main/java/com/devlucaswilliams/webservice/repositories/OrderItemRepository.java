package com.devlucaswilliams.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlucaswilliams.webservice.entities.OrderItem;
import com.devlucaswilliams.webservice.entities.User;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
