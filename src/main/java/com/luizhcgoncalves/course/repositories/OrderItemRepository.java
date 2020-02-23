package com.luizhcgoncalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizhcgoncalves.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
