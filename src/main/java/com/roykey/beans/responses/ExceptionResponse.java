package com.roykey.beans.responses;

/**
 * Created by roykey on 12/01/2016.
 */
public class ExceptionResponse implements ResponseObject {

    private String errorMessage;

    public ExceptionResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
