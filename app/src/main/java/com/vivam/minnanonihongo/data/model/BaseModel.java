package com.vivam.minnanonihongo.data.model;

import java.io.Serializable;

public abstract class BaseModel implements Serializable {

    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
