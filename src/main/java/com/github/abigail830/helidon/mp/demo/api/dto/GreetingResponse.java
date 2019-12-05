package com.github.abigail830.helidon.mp.demo.api.dto;

public class GreetingResponse {

    private String message;

    public GreetingResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
