package com.roykey.handlers;

import com.roykey.beans.responses.CounterResponse;
import com.roykey.excaptions.CounterException;

/**
 * Created by roykey on 11/01/2016.
 */
public interface Counter {

    int INITIAL_COUNTER_VALUE = 0;

    CounterResponse createCounter();
    CounterResponse addToCounter(String counterId) throws CounterException;
    CounterResponse subtractFromCounter(String counterId) throws CounterException;
    CounterResponse getCounterDetails(String counterId) throws CounterException;
}
