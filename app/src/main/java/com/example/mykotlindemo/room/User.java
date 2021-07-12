package com.example.mykotlindemo.room;

import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * @data on 2021/7/12 10:06 上午
 * @auther
 * @describe 数据库实体类
 * 参考：https://developer.android.google.cn/training/data-storage/room/defining-data?hl=zh_cn#java
 */
@Entity(tableName = "users",
        indices = {@Index(value = {"user_id"}, //user_id不可重复，通过index和unique实现。
        unique = true)})  //默认是将类名做表名，如需另起，使用tableName指定。
public class User {
    @PrimaryKey()
    @ColumnInfo(name = "user_id")
    public int id;

    @ColumnInfo(name = "user_name")
    public String name;
    @ColumnInfo(name = "user_age")
    public int age;

    public String address;

    @Ignore //默认不创建该字段
    Bitmap picture;
}
