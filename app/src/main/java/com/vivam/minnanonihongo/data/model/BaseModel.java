package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public abstract class BaseModel implements Serializable {

    @SerializedName("id")
    public long id;
}
