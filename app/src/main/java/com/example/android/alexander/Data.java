package com.example.android.alexander;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Data extends ArrayList implements Parcelable {
    private int ImgID;
    private String Title;


    public Data(int imgID, String title) {
        ImgID = imgID;
        Title = title;

    }

    protected Data(Parcel in) {
        ImgID = in.readInt();
        Title = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public int getImgID() {
        return ImgID;
    }

    public String getTitle() {
        return Title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ImgID);
        dest.writeString(Title);
    }
}
