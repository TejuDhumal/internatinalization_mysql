package com.example.internatinalization_mysql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleGlobalException(Exception e) {
        String message = e.getMessage();
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}