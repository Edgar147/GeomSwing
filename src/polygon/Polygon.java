package polygon;

import shape.Shape;

import java.util.ArrayList;

public abstract class Polygon implements Shape {
    private ArrayList<Integer> sides= new ArrayList<Integer>();
    public abstract  int getNbSides();
    public abstract  boolean isSquare();

    @Override
    public float getSurface(){return 5.6f;};
    @Override
    public float perimeter(ArrayList<Integer> sides){ return 5.4f;}



}
