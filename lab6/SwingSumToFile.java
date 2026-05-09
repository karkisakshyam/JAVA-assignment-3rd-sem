import javax.swing.*;
import java.io.*;
import java.awt.event.*;

// WAP to find sum of 2 numbers using Swing components. Show answer in file as well.
public class SwingSumToFile {
    public static void main(String[] args) {
        JFrame f = new JFrame("Sum");
        JTextField t1 = new JTextField("10"); t1.setBounds(50, 20, 100, 20);
        JTextField t2 = new JTextField("20"); t2.setBounds(50, 50, 100, 20);
        JButton b = new JButton("Sum"); b.setBounds(50, 80, 100, 30);
        
        b.addActionListener(e -> {
            int sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            JOptionPane.showMessageDialog(f, "Sum: " + sum);
            try {
                FileWriter fw = new FileWriter("sum_result.txt");
                fw.write("The sum is: " + sum);
                fw.close();
            } catch (Exception ex) {}
        });
        
        f.add(t1); f.add(t2); f.add(b);
        f.setSize(250, 200); f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}