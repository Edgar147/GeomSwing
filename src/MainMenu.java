import rectangle.Rectangle;
import shape.Shape;
import triangle.Triangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JPanel mainPanel;
    private JPanel secondPanel2;
    private JButton trianglesButton;
    private JButton rectangleButton;
    private JButton polygonNButton;
    private JButton drawButton;

    public MainMenu() {
        trianglesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                TriangleView tv= new TriangleView();
//
//                tv.setSize(600,600);
//
//                tv.setVisible(true);
//                mainPanel.setVisible(false);
//                setContentPane(tv.getTrianglePanel());
                DrawShapes shapes=new DrawShapes();
                Shape triangle=new Triangle();
                shapes.setForm(triangle);
                shapes.setMainJPanelVisible();
                mainPanel.setVisible(false);

                shapes.setSizeJPanel(800,800);
                setContentPane(shapes.getMainJPanel());


            }
        });
        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Shape rectangle=new Rectangle();
                DrawShapes shapes=new DrawShapes(rectangle);
                mainPanel.setVisible(false);
                setContentPane(shapes.getMainJPanel());


            }
        });
    }

    public static void main(String[] args) {
        MainMenu mm=new MainMenu();
        mm.setContentPane(mm.mainPanel);
        mm.setTitle("Main Menu");
        mm.setSize(1400,800);
//        mm.secondPanel2.setVisible(false);

        mm.setVisible(true);
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
