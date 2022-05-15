package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerView extends JFrame implements ActionListener {

    private JPanel north, south, center, east, west;
    private JLabel header, custNameLbl, tablenumLbl;
    private JButton nextbtn;
    private JTextField custNameTxt, tablenumTxt;

    public CustomerView() {
        super("SOS");
        this.north = new JPanel();
        this.south = new JPanel();
        this.center = new JPanel();
        this.east = new JPanel();
        this.west = new JPanel();

        this.header = new JLabel("Customer Information", JLabel.CENTER );
        this.custNameLbl = new JLabel("Customer Name");
        this.tablenumLbl = new JLabel("Table number");

        this.nextbtn = new JButton("Next");

        this.custNameTxt = new JTextField(15);
        this.tablenumTxt= new JTextField(15);
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
        center.add(custNameLbl);
        center.add(custNameTxt);

        center.add(tablenumLbl);
        center.add(tablenumTxt);

        //South Panel
        south.add(nextbtn);

        //actionButtons
        nextbtn.addActionListener(this);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setSize(600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.setGUI();
    }


        @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Next")) {
            new OrderView();
        }


    }
}
