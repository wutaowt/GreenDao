package com.example.greendao.db;

import com.example.greendao.common.MyApplication;
import com.example.greendao.gen.DaoMaster;
import com.example.greendao.gen.DaoSession;

public class GreenDaoManager {
    private static GreenDaoManager mInstance;
    private static DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;

    public GreenDaoManager() {
        if (mInstance == null) {
            DaoMaster.DevOpenHelper devOpenHelper = new
                    DaoMaster.DevOpenHelper(MyApplication.getContext(), "mydb", null);
            mDaoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
            mDaoSession = mDaoMaster.newSession();
            
        }
    }
    public static GreenDaoManager getInstance(){
        if (mInstance==null){
            synchronized (GreenDaoManager.class){
                if(mInstance==null){
                    mInstance = new GreenDaoManager();
                }
            }

        }
        return mInstance;
    }
    public static DaoMaster getMaster(){
        return mDaoMaster;
    }
    public static DaoSession getSession(){
        return mDaoSession;

    }
    public static DaoSession getnewSession(){
        mDaoSession = mDaoMaster.newSession();
        return mDaoSession;
    }

}