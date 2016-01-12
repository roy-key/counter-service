package com.roykey.resources;

import com.roykey.beans.responses.BasicResponse;
import com.roykey.beans.responses.CounterResponse;
import com.roykey.builders.CounterResponseBuilder;
import com.roykey.excaptions.CounterException;
import com.roykey.handlers.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by roykey on 11/01/2016.
 */
@RestController()
public class CounterResource {

    @Autowired
    @Resource
    private Counter counter;

    @RequestMapping(
            value = "counters",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> createCounter() {

        CounterResponse counterResponse = counter.createCounter();
        return CounterResponseBuilder.createOkResponse(counterResponse);

    }

    @RequestMapping(
            value = "counters/{id}/add",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> addToCounter(@PathVariable("id") String id) {

        try {
            CounterResponse counterResponse = counter.addToCounter(id);
            return CounterResponseBuilder.createOkResponse(counterResponse);
        } catch (CounterException counterException) {
            return CounterResponseBuilder.createBadResponse(counterException);
        }

    }

    @RequestMapping(
            value = "counters/{id}/subtract",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> subtractFromCounter(@PathVariable("id") String id) {

        try {
            CounterResponse counterResponse = counter.subtractFromCounter(id);
            return CounterResponseBuilder.createOkResponse(counterResponse);
        } catch (CounterException counterException) {
            return CounterResponseBuilder.createBadResponse(counterException);
        }
    }

    @RequestMapping(
            value = "counters/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> getCounterDetails(@PathVariable("id") String id) {

        try {
            CounterResponse counterResponse = counter.getCounterDetails(id);
            return CounterResponseBuilder.createOkResponse(counterResponse);
        } catch (CounterException counterException) {
            return CounterResponseBuilder.createBadResponse(counterException);
        }
    }
}
