package com.example.mykotlindemo.room;


import android.app.Application;
import android.os.Looper;
import android.util.Log;

import com.example.mykotlindemo.app.MyApplication;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @data on 2021/7/12 10:49 上午
 * @auther
 * @describe  Room数据库管理类
 */
public class DBManager {
    private DBManager() {
    }

    public static DBManager getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static final DBManager instance = new DBManager();
    }

    /**
     * 插入数据
     *
     * @param user
     */
    public Observable<Long> insert(User user) {
        return Observable.create((ObservableOnSubscribe<Long>) emitter -> {
            Long insert = UserDatabase.getInstance(MyApplication.instance).userDao().insertUsers(user);
            emitter.onNext(insert);
            emitter.onComplete();
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 删除数据
     */
    public Observable<Long> deleteById(int id) {
        return Observable.create((ObservableOnSubscribe<Long>) emitter -> {
            int delete = UserDatabase.getInstance(MyApplication.instance).userDao().delectByUserId(id);
            emitter.onNext((long) delete);
            emitter.onComplete();
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 更新数据
     */
    public Observable<Long> update(User user) {
        return Observable.create((ObservableOnSubscribe<Long>) emitter -> {
            int update = UserDatabase.getInstance(MyApplication.instance).userDao().updateUsers(user);
            emitter.onNext((long) update);
            emitter.onComplete();
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 查询全部数据
     */
    public Observable<List<User>> queryAll() {
        return Observable.create((ObservableOnSubscribe<List<User>>) emitter -> {
            List<User> list = UserDatabase.getInstance(MyApplication.instance).userDao().loadAllUsers();
            emitter.onNext(list);
            emitter.onComplete();
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
