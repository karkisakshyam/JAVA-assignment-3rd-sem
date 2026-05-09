import javax.swing.*;
import java.awt.*;

// WAP showing border, box and grid layout.
public class LayoutsDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Layouts");
        f.setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(2, 2));
        gridPanel.add(new JButton("1")); gridPanel.add(new JButton("2"));
        gridPanel.add(new JButton("3")); gridPanel.add(new JButton("4"));

        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JLabel("Box 1")); boxPanel.add(new JLabel("Box 2"));

        f.add(new JButton("North Border"), BorderLayout.NORTH);
        f.add(gridPanel, BorderLayout.CENTER);
        f.add(boxPanel, BorderLayout.EAST);

        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}