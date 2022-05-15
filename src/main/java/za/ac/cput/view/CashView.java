package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashView extends JFrame implements ActionListener {

    private JPanel north, south, center, east, west;
    private JLabel header, amountDueLbl, changeLbl;
    private JTextField amountDueTxt, changeTxt;
    private JButton enterbtn;

    public CashView() {

        super("SOS");
        this.north = new JPanel();
        this.south = new JPanel();
        this.center = new JPanel();
        this.east = new JPanel();
        this.west = new JPanel();

        this.header = new JLabel("Cash Payment", JLabel.CENTER);

        this.amountDueLbl = new JLabel("Amount Due");
        this.changeLbl = new JLabel("Change");

        this.amountDueTxt = new JTextField(15);
        this.changeTxt = new JTextField(15);

        this.enterbtn = new JButton("Enter");
    }

    public void setGUI() {
        //Adding Panels to JFrame
        this.setLayout(new BorderLayout());
        this.add(north, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(south, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);

        //Setting layouts
        north.setLayout(new FlowLayout(1));
        center.setLayout(new GridLayout(2, 2));
        south.setLayout(new FlowLayout(2));
        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));

        //North Panel
        north.add(header);

        //Center Panel
        center.add(amountDueLbl);
        center.add(amountDueTxt);

        center.add(changeLbl);
        center.add(changeTxt);

        //South Panel
        south.add(enterbtn);

        enterbtn.addActionListener(this);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setSize(600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @Override
    public void actionPerformed (ActionEvent e){
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Thank you for your payment. Enjoy your day");
        this.setVisible(false);

    }
}
