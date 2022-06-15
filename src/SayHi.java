import javax.swing.*;
import java.awt.event.*;

public class SayHi extends JFrame{
    private JTextField input;
    private JButton button1;
    private JPanel mainPanel;
    private JLabel output;

    public SayHi()  {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

button1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
output.setText("hello dear "+input.getText()+" !");
    }
});
        }

    public static void main(String[] args) {
        JFrame sayHi = new SayHi();
        sayHi.setVisible(true);
    }
}
