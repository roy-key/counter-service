package com.roykey.beans.responses;

/**
 * Created by roykey on 11/01/2016.
 * 
 * A Basic response hold the actual object response, and a status.
 * The status can indicates a specific counter error above the HTTP status code.
 * 
 */
public class BasicResponse {

    private ResponseObject responseObject;
    private int responseStatus;

    /**
     * Instantiates a new Basic response.
     */
    public BasicResponse() {
    }

    /**
     * Instantiates a new Basic response.
     *
     * @param responseObject the response object
     * @param responseStatus the response status
     */
    public BasicResponse(ResponseObject responseObject, int responseStatus) {
        this.responseObject = responseObject;
        this.responseStatus = responseStatus;
    }

    /**
     * Gets the response object.
     *
     * @return the response object
     */
    public ResponseObject getResponseObject() {
        return responseObject;
    }

    /**
     * Sets the response object.
     *
     * @param responseObject the response object
     */
    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }

    /**
     * Gets the response status.
     *
     * @return the response status
     */
    public int getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the response status.
     *
     * @param responseStatus the response status
     */
    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }
}
