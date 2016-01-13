package com.roykey.beans.entites;

import com.roykey.beans.CommonParameters;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by roykey on 11/01/2016.
 *
 * Represented the Counter document in the DB.
 */
@Document(collection = CommonParameters.DB_COLLECTION_COUNTERS)
public class CounterEntity {

    @Id
    private String id;
    private AtomicInteger incrementer;

    /**
     * Instantiates a new Counter entity.
     */
    public CounterEntity() {
        incrementer = new AtomicInteger();
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
     * Gets the count.
     *
     * @return the count
     */
    public int getCount() {
        return incrementer.get();
    }

    /**
     * Calls the and increment method of the incrementer.
     * Atomically increase the value by 1.
     */
    public void getAndIncrement() {
        incrementer.getAndIncrement();
    }

    /**
     * Calls the and decrement method of the incrementer.
     * Atomically decrease the value by 1.
     */
    public void getAndDecrement() {
        incrementer.getAndDecrement();
    }
}
