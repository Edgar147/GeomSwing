import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class TriangleView extends JFrame {
    private JTextField textAB;
    private JTextField textBC;
    private JTextField textCA;
    private JButton calculateButton;
    private JPanel trianglePanel;

    public JPanel getTrianglePanel(){
        return  trianglePanel;
    }

    public TriangleView() {

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(calculateButton,parseInt(textAB.getText())+parseInt(textBC.getText())+parseInt(textCA.getText()) );
            }
        });
    }

    public static void main(String[] args) {
        TriangleView tv= new TriangleView();
        tv.setContentPane(tv.trianglePanel);
        tv.setTitle("Triangle");
        tv.setSize(600,600);
        tv.setVisible(true);
        tv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
