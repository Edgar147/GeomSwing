import javax.swing.*;
import java.awt.*;
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

    public JPanel getTrianglePanel(){
        return  this.trianglePanel;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g.create();
        Line2D lin = new Line2D.Float(100, 100, 250, 260);

//        drawZone.setVisible(true);

        g2.draw(lin);

    }


    public TriangleView() {

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(calculateButton,parseInt(textAB.getText())+parseInt(textBC.getText())+parseInt(textCA.getText()) );


                trianglePanel.setVisible(true);


                drawZone.setVisible(true);
                paintComponent(drawZone.getGraphics());


//                paintComponent(getGraphics());



            }
        });
    }

    public static void main(String[] args) {
//        TriangleView tv= new TriangleView();
//        tv.setContentPane(tv.trianglePanel);
//        tv.setTitle("Triangle");
//        tv.setSize(600,600);
//        tv.trianglePanel.setVisible(false);
//        tv.drawZone.setVisible(false);
//        tv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
