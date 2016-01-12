package com.roykey.beans.responses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roykey on 12/01/2016.
 * 
 * Represents all the Counters in the DB at a current time.
 */
public class GetCountersResponse implements ResponseObject {

    private List<CounterResponse> counterResponseList;

    /**
     * Instantiates a new Get counters response.
     *
     * @param counterResponseList the counter response list
     */
    public GetCountersResponse(List<CounterResponse> counterResponseList) {
        this.counterResponseList = counterResponseList;
    }

    /**
     * Instantiates a new Get counters response.
     */
    public GetCountersResponse() {
        counterResponseList = new ArrayList<>();
    }

    /**
     * Gets the counter response list.
     *
     * @return the counter response list
     */
    public List<CounterResponse> getCounterResponseList() {
        return counterResponseList;
    }

    /**
     * Sets the counter response list.
     *
     * @param counterResponseList the counter response list
     */
    public void setCounterResponseList(List<CounterResponse> counterResponseList) {
        this.counterResponseList = counterResponseList;
    }
}
