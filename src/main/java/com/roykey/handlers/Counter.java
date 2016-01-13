package com.roykey.handlers;

import com.roykey.beans.responses.CounterResponse;
import com.roykey.beans.responses.GetCountersResponse;
import com.roykey.excaptions.CounterException;

/**
 * Created by roykey on 11/01/2016.
 */
public interface Counter {

    /**
     * The constant INITIAL_COUNTER_VALUE.
     */
    int INITIAL_COUNTER_VALUE = 0;

    /**
     * Create a counter.
     *
     * @return the counter response
     */
    CounterResponse createCounter();

    /**
     * Add 1 to the counter matching the id
     *
     * @param counterId the counter id
     * @return the counter response
     * @throws CounterException the counter exception
     */
    CounterResponse addToCounter(String counterId) throws CounterException;

    /**
     * Subtract 1 from the counter matching the id
     *
     * @param counterId the counter id
     * @return the counter response
     * @throws CounterException the counter exception
     */
    CounterResponse subtractFromCounter(String counterId) throws CounterException;

    /**
     * Gets the counter details.
     *
     * @param counterId the counter id
     * @return the counter details
     * @throws CounterException the counter exception
     */
    CounterResponse getCounterDetails(String counterId) throws CounterException;

    /**
     * Gets all of the counters details.
     *
     * @return the all counters details
     */
    GetCountersResponse getAllCountersDetails();
}
