package com.roykey.builders;

import com.roykey.beans.CommonParameters;
import com.roykey.beans.responses.BasicResponse;
import com.roykey.beans.responses.ResponseObject;
import com.roykey.excaptions.CounterException;
import com.roykey.factories.BadResponseFactory;
import org.springframework.http.ResponseEntity;

/**
 * Created by roykey on 12/01/2016.
 */
public class CounterResponseBuilder {

    public static ResponseEntity<BasicResponse> createOkResponse(ResponseObject counterResponse){
        BasicResponse basicResponse = new BasicResponse(counterResponse, CommonParameters.RESPONSE_STATUS_SUCCESS);
        return ResponseEntity.ok(basicResponse);
    }

    public static ResponseEntity<BasicResponse> createBadResponse(CounterException counterException) {
        return BadResponseFactory.crateBadResponse(counterException);
    }
}
