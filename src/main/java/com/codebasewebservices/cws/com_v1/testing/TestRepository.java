package com.codebasewebservices.cws.com_v1.testing;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestEntity, String> {
}