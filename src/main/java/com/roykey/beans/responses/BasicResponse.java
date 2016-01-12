package com.roykey.beans.responses;

/**
 * Created by roykey on 11/01/2016.
 */
public class BasicResponse {

    private ResponseObject responseObject;
    private int responseStatus;

    public BasicResponse() {
    }

    public BasicResponse(ResponseObject responseObject, int responseStatus) {
        this.responseObject = responseObject;
        this.responseStatus = responseStatus;
    }

    public ResponseObject getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }
}
