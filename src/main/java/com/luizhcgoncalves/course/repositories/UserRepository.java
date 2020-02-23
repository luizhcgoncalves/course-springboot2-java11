package com.luizhcgoncalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizhcgoncalves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
