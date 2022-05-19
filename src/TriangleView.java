import triangle.Triangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import static java.lang.Integer.parseInt;

public class TriangleView extends JPanel {
    private JTextField textAB;
    private JTextField textBC;
    private JTextField textCA;
    private JButton calculateButton;
    private JPanel trianglePanel;
    private JPanel drawZone;
    Triangle t=new Triangle();
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


        float side1=t.getA();
        float side2=t.getB();
        float side3=t.getC();
        float angle1 = t.getAlpha();
        float angle2 = t.getBeta();
        float angle3 = t.getGama();

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
//        System.out.println(x1+","+y1);
//        System.out.println(x2+","+y2);
//        System.out.println(x3+","+y3);
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
                float _a,_b,_c;
                float _alpha,_beta,_gama;
                t.setA( Float.parseFloat(textAB.getText()));
                t.setB(Float.parseFloat(textBC.getText()));
                t.setC( Float.parseFloat(textCA.getText()));
                _a=t.getA();
                System.out.println(_a);
                _b=t.getB();
                _c=t.getC();
                _alpha= (float) ((Math.pow(_b,2)+Math.pow(_c,2)-Math.pow(_a,2))/(2*_b*_c));
                t.setAlpha(_alpha);
                _beta= (float) ((Math.pow(_a,2)+Math.pow(_c,2)-Math.pow(_b,2))/(2*_a*_c));
                t.setBeta(_beta);
                _gama= (float) ((Math.pow(_a,2)+Math.pow(_b,2)-Math.pow(_c,2))/(2*_a*_b));
                t.setGama(_gama);
//              JOptionPane.showMessageDialog(calculateButton,alpha+","+beta+","+gama);
                trianglePanel.setVisible(true);
                drawZone.setVisible(true);
                paintComponent(drawZone.getGraphics());
            }
        });
    }
}
