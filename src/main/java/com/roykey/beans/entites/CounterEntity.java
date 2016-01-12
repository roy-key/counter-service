package com.roykey.beans.entites;

import com.roykey.beans.CommonParameters;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by roykey on 11/01/2016.
 */
@Document(collection = CommonParameters.DB_COLLECTION_COUNTERS)
public class CounterEntity {

    @Id
    private String id;
    private AtomicInteger incrementer;

    public CounterEntity() {
        incrementer = new AtomicInteger();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return incrementer.get();
    }

    public void getAndIncrement() {
        incrementer.getAndIncrement();
    }

    public void getAndDecrement() {
        incrementer.getAndDecrement();
    }
}
