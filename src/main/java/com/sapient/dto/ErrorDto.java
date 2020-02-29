package com.sapient.dto;

import com.sapient.Exception.CustomException;

public class ErrorDto {

    private String statusCode;
    private String description;
    private String message ;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorDto(String statusCode, String description, String message) {
        this.statusCode = statusCode;
        this.description = description;
        this.message = message;
    }

    public ErrorDto(CustomException ex){
        this.statusCode = String.valueOf(ex.getStatusCode());
        this.description = ex.getDescription();
        this.message = ex.getMessage();
    }
}
