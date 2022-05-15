package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillView extends JFrame implements ActionListener {
    /*
    * North:
    * East:
    * Center:
    * West:
    * South:
     */
    private JPanel north, west, south, center, east;
    private JLabel header, custNameLbl, tableName, qtyLbl, priceLbl;
    private JButton add, done;

    public BillView() {
        this.north = new JPanel();
        this.west = west;
        this.south = south;
        this.center = center;
        this.east = east;
        this.header = header;
        this.custNameLbl = custNameLbl;
        this.tableName = tableName;
        this.qtyLbl = qtyLbl;
        this.priceLbl = priceLbl;
        this.add = add;
        this.done = done;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
