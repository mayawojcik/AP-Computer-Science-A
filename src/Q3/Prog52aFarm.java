package Q3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog52aFarm {
    private JPanel mainPanel;
    private JButton btnClear;
    private JButton btnCalc;
    private JTextField txtLen;
    private JTextField txtWid;
    private JLabel Area;
    private JLabel Perimeter;
    private JLabel Length;
    private JLabel Width;

    public Prog52aFarm() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(txtLen.getText());
                int wid = Integer.parseInt(txtWid.getText());
                int area = len * wid;
                int perimeter = 2 * len + 2 * wid;
                Area.setText("Area: " + area);
                Perimeter.setText("Perimeter: " + perimeter);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLen.setText("");
                txtWid.setText("");
                Area.setText("Area:");
                Perimeter.setText("Perimeter:");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prog52a");
        frame.setContentPane(new Prog52aFarm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}