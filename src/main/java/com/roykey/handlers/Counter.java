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
     * Create counter counter response.
     *
     * @return the counter response
     */
    CounterResponse createCounter();

    /**
     * Add to counter counter response.
     *
     * @param counterId the counter id
     * @return the counter response
     * @throws CounterException the counter exception
     */
    CounterResponse addToCounter(String counterId) throws CounterException;

    /**
     * Subtract from counter counter response.
     *
     * @param counterId the counter id
     * @return the counter response
     * @throws CounterException the counter exception
     */
    CounterResponse subtractFromCounter(String counterId) throws CounterException;

    /**
     * Gets counter details.
     *
     * @param counterId the counter id
     * @return the counter details
     * @throws CounterException the counter exception
     */
    CounterResponse getCounterDetails(String counterId) throws CounterException;

    /**
     * Gets all counters details.
     *
     * @return the all counters details
     */
    GetCountersResponse getAllCountersDetails();
}
