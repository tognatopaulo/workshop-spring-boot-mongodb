package com.tognati.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tognati.mongo.domain.User;

@Repository

public interface UserRepository extends MongoRepository<User, String> {

}
