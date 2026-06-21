package com.learning.firsttimespring;

public class HelloResponse {
private String message;

    public HelloResponse(String hello) {
    this.message = hello;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
