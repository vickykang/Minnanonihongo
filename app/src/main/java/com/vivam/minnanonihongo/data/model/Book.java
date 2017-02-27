package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book extends BaseModel {

    @SerializedName("name")
    public String name;

    @SerializedName("lessons")
    public List<Lesson> lessons;
}
