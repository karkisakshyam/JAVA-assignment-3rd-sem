import javax.swing.*;

// WAP to create a menu, submenu and menuItems.
public class MenuDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Demo");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenu subMenu = new JMenu("Export");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("PDF");
        
        subMenu.add(i2);
        menu.add(i1);
        menu.add(subMenu);
        mb.add(menu);
        
        f.setJMenuBar(mb);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}