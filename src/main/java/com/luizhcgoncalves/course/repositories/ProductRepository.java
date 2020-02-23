package com.luizhcgoncalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizhcgoncalves.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
