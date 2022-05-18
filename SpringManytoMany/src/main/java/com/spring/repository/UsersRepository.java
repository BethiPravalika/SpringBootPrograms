package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.manytomanyrelationship.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> { 


}
