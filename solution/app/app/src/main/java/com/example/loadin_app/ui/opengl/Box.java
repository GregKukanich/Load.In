package com.example.loadin_app.ui.opengl;

import java.util.Arrays;
import java.util.stream.Stream;

public class Box extends WorldObject{

   private Hexahedron mHexahedron;

   private Vector destination;

    public Box(float width, float height, float length){
       mHexahedron = new Hexahedron(width, height, length);
        destination = new Vector(0f, 0f, 0f);
     }

     public void setDestination(Vector destination){
        this.destination = destination;
     }
     public Vector getDestination(){
        return destination;
     }

    @Override
    public Stream<Shape> getShapes() {
        return Arrays.stream(new Shape[]{ mHexahedron });
    }

    public void rotateLeftBy90Degrees(){
        mHexahedron = new Hexahedron(mHexahedron.getLength(), mHexahedron.getHeight(), mHexahedron.getWidth() );
    }

    public boolean intersects(Box otherBox){
        //TODO: implement
        return false;
    }
    public Vector getOffsetToLeftOf(){
        return null;
    }

}
