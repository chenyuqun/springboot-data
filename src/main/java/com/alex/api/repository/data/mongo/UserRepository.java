package com.alex.api.repository.data.mongo;

import com.alex.api.entity.data.mongo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
