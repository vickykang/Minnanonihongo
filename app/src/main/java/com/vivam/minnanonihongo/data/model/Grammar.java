package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Grammar extends BaseModel {

    @SerializedName("lession_id")
    public long lessonId;

    @SerializedName("content")
    public String content;

    @SerializedName("examples")
    public List<String> examples;
}
