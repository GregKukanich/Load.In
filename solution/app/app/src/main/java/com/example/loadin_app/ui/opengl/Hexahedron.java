package com.example.loadin_app.ui.opengl;

import android.graphics.Point;

import java.util.Arrays;
import java.util.stream.Stream;

public class Hexahedron extends Shape {
    private float mWidth, mHeight, mLength;

    private Color color;

    public float getWidth() {
        return mWidth;
    }

    public float getHeight() {
        return mHeight;
    }

    public float getLength() {
        return mLength;
    }

    private Triangle[] mTriangles;

    public Color getColor() {
        return color;
    }

    public Hexahedron(float width, float height, float length, Color defaultColor){
        mWidth = width;
        mHeight = height;
        mLength = length;
        color = defaultColor.adjust(1.50f);

        //IMPORTANT, the Z axis is considered horizontal and Y is considered the up direction

        float x = width;
        float z = length;
        float y = height;

        Vector p1 = new Vector(0, 0, 0, color);
        Vector p2 = new Vector(x, 0, 0, color.adjust(0.95f));
        Vector p3 = new Vector(x, 0, z, color.adjust(0.85f));
        Vector p4 = new Vector(0, 0, z,  color.adjust(0.75f));
        Vector p5 = new Vector(0, y, 0, color.adjust(0.65f));
        Vector p6 = new Vector(x, y, 0f, color.adjust(0.55f));
        Vector p7 = new Vector(x, y, z, color.adjust(0.45f));
        Vector p8 = new Vector(0, y, z,color.adjust(0.35f));


        //6 sides
        //2 triangles per side
        mTriangles = new Triangle[]{
                //base
                new Triangle(p1, p4, p3),
                new Triangle(p2, p1, p3),
//                //top
                new Triangle(p5, p7, p6),
                new Triangle(p5, p8, p7),
//                //front
                new Triangle(p1, p6, p2),
                new Triangle(p1, p5, p6),
//                //back
                new Triangle(p3, p8, p4),
                new Triangle(p3, p7, p8),
//                //right
                new Triangle(p2, p7, p3),
                new Triangle(p2, p6, p7),
//                //left
                new Triangle(p4, p5, p1),
                new Triangle(p4, p8, p5),

        };


    }

    @Override
    public void move(Vector direction) {
        for(Triangle t : mTriangles){
            t.move(direction);
        }
    }

    @Override
    public Stream<Triangle> getTriangles() {

        return Arrays.stream( mTriangles);
    }
}
