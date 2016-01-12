package com.roykey.beans.responses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roykey on 12/01/2016.
 */
public class GetCountersResponse implements ResponseObject {

    private List<CounterResponse> counterResponseList;

    public GetCountersResponse(List<CounterResponse> counterResponseList) {
        this.counterResponseList = counterResponseList;
    }

    public GetCountersResponse() {
        counterResponseList = new ArrayList<>();
    }

    public List<CounterResponse> getCounterResponseList() {
        return counterResponseList;
    }

    public void setCounterResponseList(List<CounterResponse> counterResponseList) {
        this.counterResponseList = counterResponseList;
    }
}
