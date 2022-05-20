import javax.swing.*;

import rectangle.Rectangle;
import shape.Shape;
import triangle.Triangle;

import java.io.PrintStream;


public class DrawShapes extends  JPanel{

    Shape shape;

    private JPanel mainJPanel;
    private JPanel panelTriangle;
    private JPanel panelRectangle;
    private JPanel panelPolygon;
    private JLabel forTriangle;
    private JLabel forRectangle;


    public DrawShapes(Shape _shape){
        this.shape=_shape;
        System.out.println(shape.getName());
        mainJPanel.setVisible(true);
        mainJPanel.setSize(800,800);
        panelTriangle.setVisible(_shape.getInfoOfZone("forTriangle"));
        panelRectangle.setVisible(_shape.getInfoOfZone("forRectangle"));
        panelPolygon.setVisible(_shape.getInfoOfZone("forPolygon"));



    }

    public DrawShapes(){

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
        panelPolygon.setVisible(_shape.getInfoOfZone("forPolygon"));
    }

//    public DrawShapes(Shape _shape){
//        this.shape=_shape;
//
//    }




}
