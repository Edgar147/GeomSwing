import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import static java.lang.Integer.parseInt;

public class TriangleView extends JPanel {
    final float startX=800;
    final float startY=200;
    private JTextField textAB;
    private JTextField textBC;
    private JTextField textCA;
    private JButton calculateButton;
    private JPanel trianglePanel;
    private JPanel drawZone;
    public float a;
    public float b;
    public float c;

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

    public float alpha;
    public float beta;
    public float gama;
    public JPanel getTrianglePanel(){
        return  this.trianglePanel;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        float x1 = 0;
        float y1 = 0;

        float x2 = 0;
        float y2 = 0;

        float x3 = 0;
        float y3 = 0;


        float side1=getA();
        float side2=getB();
        float side3=getC();
        float angle1 = getAlpha();
        float angle2 = getBeta();
        float angle3 = getGama();

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



        Graphics2D g2 = (Graphics2D) g.create();
        Line2D lin1 = new Line2D.Float(x1, y1, x2, y2);
        Line2D lin2 = new Line2D.Float(x2, y2, x3, y3);
        Line2D lin3 = new Line2D.Float(x1, y1, x3, y3);
        System.out.println(x1+","+y1);
        System.out.println(x2+","+y2);
        System.out.println(x3+","+y3);
//    g2.scale(-1, -1);
        g2.translate(700, 400);
        g2.draw(lin1);
        g2.draw(lin2);
        g2.draw(lin3);

    }


    public TriangleView() {

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(calculateButton,parseInt(textAB.getText())+parseInt(textBC.getText())+parseInt(textCA.getText()) );
//                double a,b,c,alpha,beta,gama;

                setA( Float.parseFloat(textAB.getText()));
                setB(Float.parseFloat(textBC.getText()));
                setC( Float.parseFloat(textCA.getText()));
                alpha= (float) ((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c));
                setAlpha(alpha);
                beta= (float) ((Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c));
                setBeta(beta);
                gama= (float) ((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b));
                        System.out.println(",,,,"+gama);

                setGama(gama);

//              JOptionPane.showMessageDialog(calculateButton,alpha+","+beta+","+gama);
                trianglePanel.setVisible(true);
                drawZone.setVisible(true);
                paintComponent(drawZone.getGraphics());
            }
        });
    }
}
