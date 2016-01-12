package com.roykey.builders;

import com.roykey.beans.responses.BasicResponse;
import com.roykey.beans.responses.CounterResponse;
import com.roykey.excaptions.CounterException;
import com.roykey.factories.BadResponseFactory;
import org.springframework.http.ResponseEntity;

/**
 * Created by roykey on 12/01/2016.
 */
public class CounterResponseBuilder {

    public static ResponseEntity<BasicResponse> createOkResponse(CounterResponse counterResponse){
        BasicResponse basicResponse = new BasicResponse(counterResponse, 0);
        return ResponseEntity.ok(basicResponse);
    }

    public static ResponseEntity<BasicResponse> createBadResponse(CounterException counterException) {
        return BadResponseFactory.crateBadResponse(counterException);
    }
}
