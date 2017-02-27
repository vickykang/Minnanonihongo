package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Word extends BaseModel {

    @SerializedName("lesson_id")
    public long lessonId;

    @SerializedName("word")
    public long word;

    @SerializedName("hiragana")
    public String hiragana;

    @SerializedName("tone")
    public int tone;

    @SerializedName("meaning")
    public String meaning;

    @SerializedName("transformations")
    public List<Transformation> transformations;
}
