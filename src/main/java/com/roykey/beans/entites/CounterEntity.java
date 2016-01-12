package com.roykey.beans.entites;

import com.roykey.beans.CommonParameters;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by roykey on 11/01/2016.
 */
@Document(collection = CommonParameters.DB_COLLECTION_COUNTERS)
public class CounterEntity {

    @Id
    private String id;
    private int count;

    public CounterEntity() {
    }

    public CounterEntity(int initialCount) {
        this.count = initialCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
