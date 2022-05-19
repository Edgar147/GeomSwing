import rectangle.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class RectangleView extends  JPanel{
    private JLabel AB_CD;
    private JLabel BC_AD;

    public float get_ab_cd() {
        return _ab_cd;
    }

    public float get_bc_ad() {
        return _bc_ad;
    }

    float _ab_cd,_bc_ad;

    private JTextField ab_cd;
    private JTextField bc_ad;
    private JButton drawButton;
    private JPanel panelRect;
    private JPanel drawZone;

    public float getAB_CD(){return _ab_cd*20;}
public float getBC_AD(){return _bc_ad*20;}
    public JPanel getRectPanel(){
        return  this.panelRect;
    }
    public RectangleView(){


        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _ab_cd=Float.parseFloat(ab_cd.getText());
                _bc_ad=Float.parseFloat(bc_ad.getText());
                panelRect.setVisible(true);


                paintComponent(drawZone.getGraphics());
            }
        });



    }


    @Override
    protected void paintComponent(Graphics g){

        super.paintComponents(g);
        float x1 = 0;
        float y1 = 0;

        float x2 = 0;
        float y2 = getAB_CD();

        float x3 = getAB_CD();
        float y3 = getBC_AD();

        float x4 = getAB_CD();
        float y4 = 0;




        Graphics2D g2 = (Graphics2D) g.create();
        Line2D lin1 = new Line2D.Float(x1, y1, x2, y2);
        Line2D lin2 = new Line2D.Float(x2, y2, x3, y3);
        Line2D lin3 = new Line2D.Float(x3, y3, x4, y4);
        Line2D lin4 = new Line2D.Float(x1, y1, x4, y4);


        g2.translate(50, 50);
        g2.draw(lin1);
        g2.draw(lin2);
        g2.draw(lin3);
        g2.draw(lin4);


    }











}
