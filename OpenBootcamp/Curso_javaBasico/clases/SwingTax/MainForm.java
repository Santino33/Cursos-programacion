package SwingTax;

import javax.swing.*;
import java.awt.*;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane textPane;
    private JTextPane TotalPane;
    private JButton calculateButton;
    private JPanel TaxPane;

    public static void main (String[]args){
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().TaxPane);
        frame.setVisible(true);
    }
}


