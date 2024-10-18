package com.hoophub.showcase.article.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends Exception{
    private final HttpStatus httpStatus;

    public BaseException(String errorMessage, HttpStatus httpStatus){
        super(errorMessage);
        this.httpStatus = httpStatus;
    }
}
