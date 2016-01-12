package com.roykey.repositories;

import com.roykey.beans.entites.CounterEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by roykey on 11/01/2016.
 */
public interface CounterRepository extends MongoRepository<CounterEntity, String> {
}

