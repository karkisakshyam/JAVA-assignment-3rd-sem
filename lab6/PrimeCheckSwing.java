import javax.swing.*;

// WAP to check whether number is prime or not using swing.
public class PrimeCheckSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Prime Checker");
        JTextField tf = new JTextField(); tf.setBounds(50, 50, 100, 20);
        JButton b = new JButton("Check"); b.setBounds(50, 80, 80, 30);
        
        b.addActionListener(e -> {
            int n = Integer.parseInt(tf.getText());
            boolean prime = n > 1;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i==0) { prime = false; break; }
            }
            JOptionPane.showMessageDialog(f, n + (prime ? " is Prime" : " is Not Prime"));
        });
        
        f.add(tf); f.add(b);
        f.setSize(250, 200); f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}