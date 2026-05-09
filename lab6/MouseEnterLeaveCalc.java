import javax.swing.*;
import java.awt.event.*;

// WAP to find sum of number when user enters button and difference when user leaves button.
public class MouseEnterLeaveCalc {
    public static void main(String[] args) {
        JFrame f = new JFrame("Hover Calc");
        JTextField t1 = new JTextField("10"); t1.setBounds(50, 20, 80, 20);
        JTextField t2 = new JTextField("5"); t2.setBounds(50, 50, 80, 20);
        JLabel res = new JLabel("Result here"); res.setBounds(50, 120, 150, 20);
        JButton btn = new JButton("Hover Me"); btn.setBounds(50, 80, 100, 30);
        
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                int sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                res.setText("Sum: " + sum);
            }
            public void mouseExited(MouseEvent e) {
                int diff = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                res.setText("Difference: " + diff);
            }
        });
        
        f.add(t1); f.add(t2); f.add(btn); f.add(res);
        f.setSize(250, 200); f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}