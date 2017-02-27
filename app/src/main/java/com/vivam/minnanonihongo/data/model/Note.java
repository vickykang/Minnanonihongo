package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

public class Note extends BaseModel {

    @SerializedName("user_id")
    public long userId;

    @SerializedName("belonged_id")
    public long belongedId;

    @SerializedName("content")
    public String content;
}
