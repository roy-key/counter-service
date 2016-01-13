package com.roykey.resources;

import com.roykey.beans.responses.BasicResponse;
import com.roykey.beans.responses.CounterResponse;
import com.roykey.beans.responses.GetCountersResponse;
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

/**
 * Created by roykey on 11/01/2016.
 */
@RestController()
public class CounterResource {

    @Autowired
    private Counter counter;

    /**
     * Create counter response entity.
     *
     * @return the response entity
     */
    @RequestMapping(
            value = "counters",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> createCounter() {

        CounterResponse counterResponse = counter.createCounter();
        return CounterResponseBuilder.createOkResponse(counterResponse);

    }

    /**
     * Add 1 to the counter matching th id
     *
     * @param id the id
     * @return the response entity
     */
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

    /**
     * Subtract 1 from the counter matching th id
     *
     * @param id the id
     * @return the response entity
     */
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

    /**
     * Gets counter details.
     *
     * @param id the id
     * @return the counter details
     */
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

    /**
     * Gets all counters details.
     *
     * @return the all counters details
     */
    @RequestMapping(
            value = "counters",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> getAllCountersDetails() {

            GetCountersResponse getCountersResponse = counter.getAllCountersDetails();
            return CounterResponseBuilder.createOkResponse(getCountersResponse);
    }
}
