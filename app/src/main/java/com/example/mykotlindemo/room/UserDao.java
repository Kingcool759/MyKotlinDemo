package com.example.mykotlindemo.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * @data on 2021/7/12 10:11 上午
 * @auther
 * @describe Room-Dao层
 */

@Dao
public interface UserDao {  //实现简单的增删改查
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Long insertUsers(User... users);

    @Update
    public int updateUsers(User... users);

    @Delete
    public int deleteUsers(User... users);

    @Delete
    public int delectByUserId(int id);

    //查询所有数据
    @Query("SELECT * FROM users")
    public List<User> loadAllUsers();
}
