package com.example.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;

public class FeedStory implements Parcelable {

    private String title;
    private String cover;
    private String fullname;
    private String[] user;

    public FeedStory(String title, String cover, String fullname, String[] user) {
        this.title = title;
        this.cover = cover;
        this.fullname = fullname;
        this.user = user;
    }
    public FeedStory() {
    }

    protected FeedStory(Parcel in) {
        title = in.readString();
        cover = in.readString();
        fullname = in.readString();
        user = in.createStringArray();
    }

    public static final Creator<FeedStory> CREATOR = new Creator<FeedStory>() {
        @Override
        public FeedStory createFromParcel(Parcel in) {
            return new FeedStory(in);
        }

        @Override
        public FeedStory[] newArray(int size) {
            return new FeedStory[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String[] getUser() {
        return user;
    }

    public void setUser(String[] user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "FeedStory{" +
                "title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", fullname='" + fullname + '\'' +
                ", user=" + Arrays.toString(user) +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(cover);
        parcel.writeString(fullname);
        parcel.writeStringArray(user);
    }
}
