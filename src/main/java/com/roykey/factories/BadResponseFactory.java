package com.roykey.factories;

import com.roykey.beans.responses.BasicResponse;
import com.roykey.beans.responses.ExceptionResponse;
import com.roykey.excaptions.CounterException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by roykey on 12/01/2016.
 *
 * Create a proper response upon the HTTP status.
 */
public class BadResponseFactory {

    /**
     * Crate bad response.
     *
     * @param counterException the counter exception
     * @return the response entity
     */
    public static ResponseEntity<BasicResponse> crateBadResponse(CounterException counterException) {

        ResponseEntity<BasicResponse> res;
        BasicResponse basicResponse;

        HttpStatus httpStatus = counterException.getHttpStatus();
        switch (httpStatus) {
            case NOT_FOUND:
                basicResponse = getExceptionResponse(counterException);
                res = ResponseEntity.status(httpStatus).body(basicResponse);
                break;

            default:
                basicResponse = getExceptionResponse(counterException);
                res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(basicResponse);
                break;
        }

        return res;
    }

    private static BasicResponse getExceptionResponse(CounterException counterException) {

        ExceptionResponse exceptionResponse;
        BasicResponse basicResponse;
        exceptionResponse = new ExceptionResponse(counterException.getMessage());
        basicResponse = new BasicResponse(exceptionResponse, counterException.getInternalError());
        return basicResponse;

    }
}
