package triangle;

import shape.Shape;

import java.util.ArrayList;

public class Triangle implements Shape {
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
}
