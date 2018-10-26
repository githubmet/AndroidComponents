package com.example.user.androidcomponent.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class P024ParcelableCalisanClass implements Parcelable {
    public int calisanId;
    public String calisanName;
    public String calisanSurname;

    public P024ParcelableCalisanClass(int calisanId, String calisanName, String calisanSurname) {
        this.calisanId = calisanId;
        this.calisanName = calisanName;
        this.calisanSurname = calisanSurname;
    }

    protected P024ParcelableCalisanClass(Parcel in) {
        calisanId=in.readInt();
        calisanName=in.readString();
        calisanSurname=in.readString();

    }

    public static final Creator<P024ParcelableCalisanClass> CREATOR = new Creator<P024ParcelableCalisanClass>() {
        @Override
        public P024ParcelableCalisanClass createFromParcel(Parcel in) {
            return new P024ParcelableCalisanClass(in);
        }

        @Override
        public P024ParcelableCalisanClass[] newArray(int size) {
            return new P024ParcelableCalisanClass[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(calisanId);
        parcel.writeString(calisanName);
        parcel.writeString(calisanSurname);
    }
}
