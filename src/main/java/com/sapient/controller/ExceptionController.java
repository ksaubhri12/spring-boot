package com.sapient.controller;

import com.sapient.Exception.CustomException;
import com.sapient.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object>handleCustomException(CustomException ex){
        ErrorDto errorDto = new ErrorDto(ex);
        return new ResponseEntity<>(errorDto, ex.getStatusCode());
    }

}
