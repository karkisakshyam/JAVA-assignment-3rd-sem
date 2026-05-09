import javax.swing.*;

// WAP to find square and cube root of number using swing.
public class RootsSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Roots");
        JTextField t = new JTextField(); t.setBounds(50, 30, 100, 20);
        JButton b1 = new JButton("Sq Root"); b1.setBounds(20, 70, 80, 30);
        JButton b2 = new JButton("Cb Root"); b2.setBounds(110, 70, 80, 30);
        
        b1.addActionListener(e -> {
            double res = Math.sqrt(Double.parseDouble(t.getText()));
            JOptionPane.showMessageDialog(f, "Square Root: " + res);
        });
        b2.addActionListener(e -> {
            double res = Math.cbrt(Double.parseDouble(t.getText()));
            JOptionPane.showMessageDialog(f, "Cube Root: " + res);
        });
        
        f.add(t); f.add(b1); f.add(b2);
        f.setSize(250, 200); f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}