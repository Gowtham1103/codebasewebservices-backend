package com.codebasewebservices.cws.com_v1.testing;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public TestEntity save(@RequestBody TestEntity testEntity) {
        return testService.save(testEntity);
    }

    @GetMapping
    public List<TestEntity> getAll() {
        return testService.getAll();
    }
}