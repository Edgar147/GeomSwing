package rectangle;

import polygon.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Polygon {


    @Override
    public float getSurface(){return 5.65f;}


    @Override
    public boolean isSquare(){return true;}

    @Override
    public float perimeter(ArrayList<Integer> sides){
        return sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3);
    }


    @Override
    public int getNbSides(){
        return  4;
    }
}
