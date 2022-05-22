package rectangle;

import polygon.Polygon;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Polygon {

final int  ZOOM=20;
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
    @Override
    public String getName(){
        return "This is a Rectangle";
    }

    @Override
    public boolean getInfoOfZone(String nameZone){
        return nameZone=="forRectangle";
    }

    @Override
    public ArrayList<Line2D> constructPoints(ArrayList<Float> L){
        ArrayList<Float> coordinate_list= new ArrayList<Float>();
        ArrayList<Line2D> lines = new ArrayList<Line2D>();

        float x1 = 0;
        float y1 = 0;

        float x2 = 0;
        float y2 = L.get(0);

        float x3 = L.get(1);
        float y3 = L.get(2);

        float x4 = L.get(3);
        float y4 = 0;


        coordinate_list.add(x1*ZOOM);
        coordinate_list.add(y1*ZOOM);
        coordinate_list.add(x2*ZOOM);
        coordinate_list.add(y2*ZOOM);
        coordinate_list.add(x3*ZOOM);
        coordinate_list.add(y3*ZOOM);
        coordinate_list.add(x4*ZOOM);
        coordinate_list.add(y4*ZOOM);
        Line2D lin1 = new Line2D.Float(coordinate_list.get(0), coordinate_list.get(1), coordinate_list.get(2), coordinate_list.get(3));
        Line2D lin2 = new Line2D.Float(coordinate_list.get(2), coordinate_list.get(3), coordinate_list.get(4), coordinate_list.get(5));
        Line2D lin3 = new Line2D.Float(coordinate_list.get(4), coordinate_list.get(5), coordinate_list.get(6), coordinate_list.get(7));
        Line2D lin4 = new Line2D.Float(coordinate_list.get(0), coordinate_list.get(1), coordinate_list.get(6), coordinate_list.get(7));
        lines.add(lin1);
        lines.add(lin2);
        lines.add(lin3);
        lines.add(lin4);
        return lines;
    }


}
