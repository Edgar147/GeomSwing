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
                TriangleView tv= new TriangleView();
//                tv.setContentPane(tv.getTrianglePanel());
//                tv.setTitle("Triangle");
                tv.setSize(600,600);

                tv.setVisible(true);
                mainPanel.setVisible(false);
                setContentPane(tv.getTrianglePanel());
//                tv.getDrawZone().setVisible(false);
//                mainPanel.setVisible(false);
//                tv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//              mainPanel.setVisible(false);
//                setContentPane(secondPanel2);
//                secondPanel2.setVisible(true);



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
