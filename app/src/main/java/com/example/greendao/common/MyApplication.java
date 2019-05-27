package com.example.greendao.common;

import android.app.Application;
import android.content.Context;

import com.example.greendao.db.GreenDaoManager;
import com.example.greendao.gen.DaoSession;

public class MyApplication extends Application {
    private DaoSession daoSession;
    public static Context mContext;

    public static Context getContext() {
        return mContext;
    }
@Override
    public  void onCreate(){
        super.onCreate();
    GreenDaoManager.getInstance();
    }



}
