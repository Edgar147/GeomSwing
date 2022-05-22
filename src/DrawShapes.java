import javax.swing.*;

import shape.Shape;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Arrays;


public class DrawShapes extends  JPanel{

    Shape shape;

    private JPanel mainJPanel;
    private JPanel panelTriangle;
    private JPanel panelRectangle;
    private JPanel panelPolygon;
    private JTextField r1;
    private JTextField r2;
    private JTextField r3;
    private JTextField r4;
    private JButton drawButton;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JPanel drawZone;
    ArrayList<Line2D> response_L=new ArrayList<Line2D>();


    public ArrayList<Line2D> getResponse_L(){
    return this.response_L;
}
    public DrawShapes(Shape _shape){
        this.shape=_shape;
        System.out.println(shape.getName());
        mainJPanel.setVisible(true);
        mainJPanel.setSize(800,800);
        panelTriangle.setVisible(_shape.getInfoOfZone("forTriangle"));
        panelRectangle.setVisible(_shape.getInfoOfZone("forRectangle"));
        drawZone.setVisible(true);
//        panelPolygon.setVisible(_shape.getInfoOfZone("forPolygon"));


            drawButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("sssssqef");
                    ArrayList<Float> L=new ArrayList<Float>();

                    try {
                        L.add(Float.parseFloat(r1.getText()));
                        L.add(Float.parseFloat(r2.getText()));
                        L.add(Float.parseFloat(r3.getText()));
                        L.add(Float.parseFloat(r4.getText()));
                    }
                    catch (Exception e1){
                        L.add(Float.parseFloat(t1.getText()));
                        L.add(Float.parseFloat(t2.getText()));
                        L.add(Float.parseFloat(t3.getText()));
                    }
                    response_L=shape.constructPoints(L);

                    paintComponent(drawZone.getGraphics());


                }
            });
        }
    @Override
    protected void paintComponent(Graphics g){

        super.paintComponents(g);
        System.out.println("ddd"+Arrays.toString(response_L.toArray()));

        Graphics2D g2 = (Graphics2D) g.create();
//        Line2D lin1 = new Line2D.Float(response_L.get(0), response_L.get(1), response_L.get(2), response_L.get(3));
//        Line2D lin2 = new Line2D.Float(response_L.get(2), response_L.get(3), response_L.get(4), response_L.get(5));
//        Line2D lin3 = new Line2D.Float(response_L.get(4), response_L.get(5), response_L.get(6), response_L.get(7));
//        Line2D lin4 = new Line2D.Float(response_L.get(0), response_L.get(1), response_L.get(6), response_L.get(7));



        g2.translate(50, 50);
//        for i in len(lines)
        for(int i=0;i<response_L.size();i++) {
            g2.draw(response_L.get(i));
//        g2.draw(lin2);
//        g2.draw(lin3);
//        g2.draw(lin4);
        }

    }







    public void setMainJPanelVisible(){  mainJPanel.setVisible(true);}

    public JPanel getMainJPanel() {
        return mainJPanel;
    }
    public void setSizeJPanel(int x,int y){
        mainJPanel.setSize(x,y);
    }

    public void setForm(Shape _shape){
        this.shape=_shape;
        System.out.println(shape.getName());
        panelTriangle.setVisible(_shape.getInfoOfZone("forTriangle"));
        panelRectangle.setVisible(_shape.getInfoOfZone("forRectangle"));
//        panelPolygon.setVisible(_shape.getInfoOfZone("forPolygon"));
    }

//    public DrawShapes(Shape _shape){
//        this.shape=_shape;
//
//    }





}
