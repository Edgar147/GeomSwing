import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends JFrame{
    private JPanel panelMain;
    private JPanel secondPanel;
    private JTextField txtName;
    private JButton myButton;

    public HelloSwing() {
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(myButton,txtName.getText()+ " hello");
                HelloSwing x= new HelloSwing();
//                x.setContentPane(x.secondPanel);
                x.setTitle("New one");
                x.setSize(600,600);
                x.setVisible(true);
                x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



            }
        });
    }

    public static void main(String[] args) {
            HelloSwing h= new HelloSwing();
            h.setContentPane(h.panelMain);
            h.setTitle("My windows");
            h.setBounds(600,200,200,200);
            h.setSize(500,540);
            h.setVisible(true);
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
