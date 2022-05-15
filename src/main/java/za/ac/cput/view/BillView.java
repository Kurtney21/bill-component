package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillView extends JFrame implements ActionListener {

    private JPanel north, south, center, east, west;
    private JLabel header, header2;
    private JButton cashbtn,cardbtn;

    public BillView() {

        super("SOS");
        this.north = new JPanel();
        this.south = new JPanel();
        this.center = new JPanel();
        this.east = new JPanel();
        this.west = new JPanel();

        this.header = new JLabel("Customer Information", JLabel.CENTER );
        this.header2 = new JLabel("Do you want to pay Cash or Card?", JLabel.CENTER );

        this.cashbtn = new JButton("Cash");
        this.cardbtn = new JButton("Card");

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
        center.add(header2);
        center.add(cashbtn);
        center.add(cardbtn);

        //actionButtons
        cashbtn.addActionListener(this);
        cardbtn.addActionListener(this);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setSize(600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
