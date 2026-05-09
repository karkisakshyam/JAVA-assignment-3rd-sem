import javax.swing.*;

// WAP to create a login form.
public class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");
        JTextField user = new JTextField();
        user.setBounds(50, 50, 150, 20);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(50, 80, 150, 20);
        JButton btn = new JButton("Login");
        btn.setBounds(50, 110, 80, 30);
        
        f.add(user); f.add(pass); f.add(btn);
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}