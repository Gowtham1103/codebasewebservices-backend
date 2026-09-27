package com.codebasewebservices.cws.com_v1.testing;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public TestEntity save(TestEntity testEntity) {
        return testRepository.save(testEntity);
    }

    public List<TestEntity> getAll() {
        return testRepository.findAll();
    }
}