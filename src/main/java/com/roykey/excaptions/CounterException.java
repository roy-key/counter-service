package com.roykey.excaptions;

import org.springframework.http.HttpStatus;

/**
 * Created by roykey on 12/01/2016.
 */
public class CounterException extends Exception {

    private HttpStatus httpStatus;
    private int internalError;

    /**
     * Instantiates a new Counter exception.
     *
     * @param message       the message
     * @param httpStatus    the http status
     * @param internalError the internal error
     */
    public CounterException(String message, HttpStatus httpStatus, int internalError) {
        super(message);
        this.httpStatus = httpStatus;
        this.internalError = internalError;
    }

    /**
     * Gets http status.
     *
     * @return the http status
     */
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    /**
     * Sets http status.
     *
     * @param httpStatus the http status
     */
    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    /**
     * Gets internal error.
     *
     * @return the internal error
     */
    public int getInternalError() {
        return internalError;
    }

    /**
     * Sets internal error.
     *
     * @param internalError the internal error
     */
    public void setInternalError(int internalError) {
        this.internalError = internalError;
    }
}
