package com.example.android.sofiaguide;



public class Location {
    private int mName;
    private int mAddress;
    private int mDescription;
    private int mImageId;

    public Location(int name, int address, int description, int imageId) {
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageId = imageId;
    }

    public int getmName() {
        return mName;
    }

    public int getmAddress() {
        return mAddress;
    }

    public int getmDescription() {
        return mDescription;
    }

    public int getmImageId() {
        return mImageId;
    }
}
