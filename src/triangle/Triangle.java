package triangle;

import shape.Shape;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Triangle implements Shape {
    final int  ZOOM=20;
    private float a,b,c;
    private float alpha,beta,gama;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = 20*a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = 20*b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = 20*c;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    public float getGama() {
        return gama;
    }

    public void setGama(float gama) {
        this.gama = gama;
    }


    @Override
    public float getSurface() {
        return 0;
    }

    @Override
    public float perimeter(ArrayList<Integer> sides) {
        return 0;
    }

    @Override
    public String getName(){
        return "This is a Triangle";
    }


    public void setPoints(ArrayList<Float> L){
        setA(L.get(0));
        setB(L.get(1));
        setC(L.get(2));
    }

    @Override
    public boolean getInfoOfZone(String nameZone){
        return nameZone=="forTriangle";
    }

    @Override
    public ArrayList<Line2D> constructPoints(ArrayList<Float> L){
        ArrayList<Line2D> lines=new ArrayList<Line2D>();
        ArrayList<Float> coordiate_list=new ArrayList<Float>();
        float x1 = 0;
        float y1 = 0;

        float x2 = 0;
        float y2 = 0;

        float x3 = 0;
        float y3 = 0;


        float side1=L.get(0);
        float side2=L.get(1);
        float side3=L.get(2);
        float angle1 = (float) ((Math.pow(side2,2)+Math.pow(side3,2)-Math.pow(side1,2))/(2*side2*side3));
        float angle2 =  (float) ((Math.pow(side1,2)+Math.pow(side3,2)-Math.pow(side2,2))/(2*side1*side3));
        float angle3 =  (float) ((Math.pow(side1,2)+Math.pow(side2,2)-Math.pow(side3,2))/(2*side1*side2));

        if(angle1==0.0){
            x1 = 0;
            y1 = 0;

            x2 = side2;
            y2 = 0;

            x3 = 0;
            y3 = side3;
        }
        else  if(angle2==0.0){
            x2 = 0;
            y2 = 0;

            x1 = side1;
            y1 = 0;

            x3 = 0;
            y3 = side3;
        }
        else if (angle3==0.0){
            x3 = 0;
            y3 = 0;

            x1 = side1;
            y1 = 0;

            x2 = 0;
            y2 = side2;
        }
        else {
            x1 = 0;
            y1 = 0;

            x3 = side2;
            y3 = 0;

            x2 = (float)( side2*Math.cos(angle1));
            y2 = (float) (side2*Math.sin(angle1));
        }
        coordiate_list.add(x1*ZOOM);
        coordiate_list.add(y1*ZOOM);
        coordiate_list.add(x2*ZOOM);
        coordiate_list.add(y2*ZOOM);
        coordiate_list.add(x3*ZOOM);
        coordiate_list.add(y3*ZOOM);
        Line2D lin1 = new Line2D.Float(coordiate_list.get(0), coordiate_list.get(1), coordiate_list.get(2), coordiate_list.get(3));
        Line2D lin2 = new Line2D.Float(coordiate_list.get(2), coordiate_list.get(3), coordiate_list.get(4), coordiate_list.get(5));
        Line2D lin3 = new Line2D.Float(coordiate_list.get(0), coordiate_list.get(1), coordiate_list.get(4), coordiate_list.get(5));
        System.out.println(x1+","+y1+","+x2+","+y2+","+x3+","+y3+",");
//        System.out.println(x1+","+y1);
//        System.out.println(x2+","+y2);
//        System.out.println(x3+","+y3);
//    g2.scale(-1, -1);
        lines.add(lin1);
        lines.add(lin2);
        lines.add(lin3);

        return lines;
        }

}
