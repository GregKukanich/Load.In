package com.example.loadin_app.ui.opengl;

import android.graphics.Point;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Hexahedron extends Shape {
    private float mWidth, mHeight, mLength;


    public float getWidth() {
        return mWidth;
    }

    public float getHeight() {
        return mHeight;
    }

    public float getLength() {
        return mLength;
    }





    public Hexahedron(float width, float height, float length){
        mWidth = width;
        mHeight = height;
        mLength = length;



    }

}
