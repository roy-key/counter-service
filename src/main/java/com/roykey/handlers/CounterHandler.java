package com.roykey.handlers;

import com.roykey.beans.entites.CounterEntity;
import com.roykey.beans.responses.CounterResponse;
import com.roykey.dao.CounterDAO;
import com.roykey.excaptions.CounterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by roykey on 11/01/2016.
 */
@Component
public class CounterHandler implements Counter {

    @Autowired
    @Resource
    private CounterDAO counterDAO;

    @Override
    public CounterResponse createCounter() {

        CounterEntity counterEntity = new CounterEntity();
        CounterEntity counterEntityAfterAdding = counterDAO.insertCounterEntityToDB(counterEntity);
        CounterResponse counterResponse = new CounterResponse(counterEntityAfterAdding);
        return counterResponse;
    }

    @Override
    public CounterResponse addToCounter(String counterId) throws CounterException {

        CounterEntity counterEntity = counterDAO.getCounterEntity(counterId);

        counterEntity.getAndIncrement();

        CounterEntity counterEntityAfterUpdate = counterDAO.updateCounterEntityFromDB(counterEntity);

        CounterResponse counterResponse = new CounterResponse(counterEntityAfterUpdate);
        return counterResponse;
    }

    @Override
    public CounterResponse subtractFromCounter(String counterId) throws CounterException {

        CounterEntity counterEntity = counterDAO.getCounterEntity(counterId);

        counterEntity.getAndDecrement();

        CounterEntity counterEntityAfterUpdate = counterDAO.updateCounterEntityFromDB(counterEntity);

        CounterResponse counterResponse = new CounterResponse(counterEntityAfterUpdate);
        return counterResponse;
    }

    @Override
    public CounterResponse getCounterDetails(String counterId) throws CounterException {

        CounterEntity counterEntity = counterDAO.getCounterEntity(counterId);
        CounterResponse counterResponse = new CounterResponse(counterEntity);

        return counterResponse;
    }
}
