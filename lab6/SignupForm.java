import javax.swing.*;

// WAP to create a signup form.
public class SignupForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Signup");
        f.add(new JLabel("Name:")).setBounds(20, 20, 80, 20);
        f.add(new JTextField()).setBounds(100, 20, 150, 20);
        f.add(new JLabel("Email:")).setBounds(20, 50, 80, 20);
        f.add(new JTextField()).setBounds(100, 50, 150, 20);
        JButton btn = new JButton("Register");
        btn.setBounds(100, 90, 100, 30);
        f.add(btn);
        
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}