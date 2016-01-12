package com.roykey.beans.responses;

import com.roykey.beans.entites.CounterEntity;

/**
 * Created by roykey on 11/01/2016.
 */
public class CounterResponse implements ResponseObject {

    private String id;
    private int counterValue;

    /**
     * Instantiates a new Counter response.
     */
    public CounterResponse() {
    }

    /**
     * Instantiates a new Counter response.
     *
     * @param id           the id
     * @param counterValue the counter value
     */
    public CounterResponse(String id, int counterValue) {
        this.id = id;
        this.counterValue = counterValue;
    }

    /**
     * Instantiates a new Counter response.
     *
     * @param counterEntity the counter entity
     */
    public CounterResponse(CounterEntity counterEntity) {
        this.id = counterEntity.getId();
        this.counterValue = counterEntity.getCount();
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the counter value.
     *
     * @return the counter value
     */
    public int getCounterValue() {
        return counterValue;
    }

    /**
     * Sets the counter value.
     *
     * @param counterValue the counter value
     */
    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }
}
