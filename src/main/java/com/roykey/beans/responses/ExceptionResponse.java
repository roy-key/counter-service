package com.roykey.beans.responses;

/**
 * Created by roykey on 12/01/2016.
 * 
 * Exception response holds informative errorMessage about the exceptaion.
 */
public class ExceptionResponse implements ResponseObject {

    private String errorMessage;

    /**
     * Instantiates a new Exception response.
     *
     * @param errorMessage the error message
     */
    public ExceptionResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Gets the error message.
     *
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the error message.
     *
     * @param errorMessage the error message
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
