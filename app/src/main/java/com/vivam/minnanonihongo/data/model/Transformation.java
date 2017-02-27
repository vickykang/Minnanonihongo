package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kangweodai on 27/02/17.
 */

public class Transformation {

    @SerializedName("word_id")
    public long wordId;

    @SerializedName("type")
    public String type;

    @SerializedName("result")
    public String result;

    @SerializedName("example")
    public String example;
}
