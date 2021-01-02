package com.gitub.alcemirjunior.spiringMongoDB.repository;

import com.gitub.alcemirjunior.spiringMongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
