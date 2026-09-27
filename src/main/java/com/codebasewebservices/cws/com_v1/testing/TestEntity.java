package com.codebasewebservices.cws.com_v1.testing;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")
public class TestEntity {

    @Id
    private String id;

    private String message;

    public TestEntity() {
    }

    public TestEntity(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}