package com.vivam.minnanonihongo.data.model;

import com.google.gson.annotations.SerializedName;

public class User extends BaseModel {

    @SerializedName("phone")
    public String phone;

    @SerializedName("password")
    public String password;

    @SerializedName("name")
    public String name;
}
