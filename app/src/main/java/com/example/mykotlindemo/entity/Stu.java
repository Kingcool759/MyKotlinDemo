package com.example.mykotlindemo.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @data on 2021/7/2 11:04 上午
 * @auther
 * @describe 序列化对象
 */
public class Stu implements Parcelable {
    public String id = "";
    public String name = "";

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readString();
        this.name = source.readString();
    }

    public Stu() {
    }

    protected Stu(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<Stu> CREATOR = new Parcelable.Creator<Stu>() {
        @Override
        public Stu createFromParcel(Parcel source) {
            return new Stu(source);
        }

        @Override
        public Stu[] newArray(int size) {
            return new Stu[size];
        }
    };
}
