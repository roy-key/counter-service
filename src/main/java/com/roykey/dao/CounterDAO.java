package com.roykey.dao;

import com.roykey.beans.entites.CounterEntity;
import com.roykey.excaptions.CounterException;
import com.roykey.repositories.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roykey on 11/01/2016.
 */
@Component
public class CounterDAO {

    @Autowired
    private CounterRepository counterRepository;

    public CounterEntity insertCounterEntityToDB(CounterEntity counterEntity){
        return counterRepository.insert(counterEntity);
    }

    public CounterEntity updateCounterEntityFromDB(CounterEntity counterEntity){
        return counterRepository.save(counterEntity);
    }

    public CounterEntity getCounterEntity(String id) throws CounterException {
        CounterEntity counterEntity = counterRepository.findOne(id);
        if (counterEntity == null){
            throw new CounterException("counterId: " + id + " wasn't found, please check your id and try again", HttpStatus.NOT_FOUND,1001);
        }
        return counterEntity;
    }

    public List<CounterEntity> getAllCounterEntities(){
        List<CounterEntity> counterEntityList = counterRepository.findAll();
        return counterEntityList;
    }

}