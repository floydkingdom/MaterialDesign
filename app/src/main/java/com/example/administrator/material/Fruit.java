package com.example.administrator.material;

/**
 * Created by Administrator on 2017/5/20.
 */

public class Fruit {
    private String mName;
    private int mImageId;

    public Fruit(String name, int imageId) {
        mName = name;
        mImageId = imageId;
    }

    public String getName() {
        return mName;
    }

    public int getImageId() {
        return mImageId;
    }
}
