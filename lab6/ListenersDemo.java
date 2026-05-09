import javax.swing.*;
import java.awt.event.*;

// WAP showing mouse, key, focus and window listener.
public class ListenersDemo extends JFrame implements MouseListener, KeyListener, FocusListener, WindowListener {
    public ListenersDemo() {
        JTextField tf = new JTextField("Interact with me");
        tf.setBounds(50, 50, 150, 20);
        tf.addMouseListener(this);
        tf.addKeyListener(this);
        tf.addFocusListener(this);
        this.addWindowListener(this);
        add(tf);
        setSize(300, 200); setLayout(null); setVisible(true);
    }
    
    public void mouseClicked(MouseEvent e) { System.out.println("Mouse Clicked"); }
    public void mousePressed(MouseEvent e) {} public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {} public void mouseExited(MouseEvent e) {}
    public void keyTyped(KeyEvent e) { System.out.println("Key Typed"); }
    public void keyPressed(KeyEvent e) {} public void keyReleased(KeyEvent e) {}
    public void focusGained(FocusEvent e) { System.out.println("Focus Gained"); }
    public void focusLost(FocusEvent e) { System.out.println("Focus Lost"); }
    public void windowOpened(WindowEvent e) { System.out.println("Window Opened"); }
    public void windowClosing(WindowEvent e) { System.exit(0); }
    public void windowClosed(WindowEvent e) {} public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {} public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) { new ListenersDemo(); }
}