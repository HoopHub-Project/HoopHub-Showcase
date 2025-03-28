package com.hoophub.showcase.article.exception;

import org.hibernate.sql.exec.internal.BaseExecutionContext;
import org.springframework.http.HttpStatus;

public class ArticleException extends BaseException {
    public ArticleException(String errorMessage, HttpStatus httpStatus) {
        super(errorMessage, httpStatus);
    }
}
