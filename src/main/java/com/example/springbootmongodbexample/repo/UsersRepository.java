package com.example.springbootmongodbexample.repo;

import com.example.springbootmongodbexample.document.Users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String>{ 
}