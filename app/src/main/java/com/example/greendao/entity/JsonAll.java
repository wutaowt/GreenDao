package com.example.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class JsonAll {
    private String json;

    @Generated(hash = 889397851)
    public JsonAll(String json) {
        this.json = json;
    }

    @Generated(hash = 73362913)
    public JsonAll() {
    }

    public String getJson() {
        return this.json;
    }

    public void setJson(String json) {
        this.json = json;
    }


}
