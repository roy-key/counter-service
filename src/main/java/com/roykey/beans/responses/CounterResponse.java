package com.roykey.beans.responses;

import com.roykey.beans.entites.CounterEntity;

/**
 * Created by roykey on 11/01/2016.
 */
public class CounterResponse implements ResponseObject {

    private String id;
    private int counterValue;

    public CounterResponse() {
    }

    public CounterResponse(String id, int counterValue) {
        this.id = id;
        this.counterValue = counterValue;
    }

    public CounterResponse(CounterEntity counterEntity) {
        this.id = counterEntity.getId();
        this.counterValue = counterEntity.getCount();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }
}
