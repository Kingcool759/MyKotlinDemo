package com.example.mykotlindemo.room;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

/**
 * @data on 2021/7/12 10:35 上午
 * @auther
 * @describe 数据库实体类
 */
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public static final String DATABASE_NAME = "users";

    private static UserDatabase sInstance;

    public static UserDatabase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (UserDatabase.class) {
                if (sInstance == null) {
                    sInstance = buildDatabase(context);
                }
            }
        }
        return sInstance;
    }


    private static UserDatabase buildDatabase(final Context appContext) {
        return Room.databaseBuilder(appContext, UserDatabase.class, "users")
                .allowMainThreadQueries()
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);

                    }

                    @Override
                    public void onOpen(@NonNull SupportSQLiteDatabase db) {
                        super.onOpen(db);
                    }

                })
                .build();
    }

}
