import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JPanel mainPanel;
    private JButton trianglesButton;
    private JButton rectangleButton;
    private JButton polygonNButton;

    public MainMenu() {
        trianglesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TriangleView tv= new TriangleView();
                tv.setContentPane(tv.getTrianglePanel());
                tv.setTitle("Triangle");
                tv.setSize(600,600);
                tv.setVisible(true);
                tv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    public static void main(String[] args) {
        MainMenu mm=new MainMenu();
        mm.setContentPane(mm.mainPanel);
        mm.setTitle("Main Menu");
        mm.setSize(600,600);
        mm.setVisible(true);
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
