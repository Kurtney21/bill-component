package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Receipt extends JFrame implements ActionListener {
    private JPanel center;
    private JTextArea receiptArea;

    public Receipt(){
        super("SOS");
        this.center = new JPanel();
        this.receiptArea = new JTextArea();
    }

    public void setGUI(){
        this.add(center, BorderLayout.CENTER);
        center.setLayout(new FlowLayout(1));

        center.add(receiptArea, BorderLayout.CENTER);
        receiptArea.setText("dsjd\nsvs\nsdsdcsd\nsdff");

        this.pack();
        this.setSize(new Dimension(200,400));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.setGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
