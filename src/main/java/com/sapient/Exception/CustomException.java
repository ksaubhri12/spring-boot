package com.sapient.Exception;

import org.springframework.http.HttpStatus;

public class CustomException extends Exception {

    private HttpStatus statusCode ;
    private String description ;
    private String message ;

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public CustomException(HttpStatus statusCode, String description, String message) {
        this.statusCode = statusCode;
        this.description = description;
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
