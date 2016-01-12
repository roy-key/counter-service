package com.roykey.excaptions;

import org.springframework.http.HttpStatus;

/**
 * Created by roykey on 12/01/2016.
 */
public class CounterException extends Exception {

    private HttpStatus httpStatus;
    private int internalError;

    public CounterException(String message, HttpStatus httpStatus, int internalError) {
        super(message);
        this.httpStatus = httpStatus;
        this.internalError = internalError;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getInternalError() {
        return internalError;
    }

    public void setInternalError(int internalError) {
        this.internalError = internalError;
    }
}
