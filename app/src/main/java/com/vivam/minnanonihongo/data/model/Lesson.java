package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Lesson extends BaseModel {

    @SerializedName("book_id")
    public long bookId;

    @SerializedName("index")
    public int index;

    @SerializedName("name")
    public String name;

    @SerializedName("words")
    public List<Word> words;

    @SerializedName("grammars")
    public List<Grammar> grammars;
}
