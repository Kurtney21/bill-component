package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;

public class CheckoutView extends JFrame {
    private JPanel center, north, east, south;
    private JLabel header;
    private JTextArea receipt;

    public CheckoutView(){
        this.center = new JPanel();
        this.north = new JPanel();
        this.east = new JPanel();
        this.south =  new JPanel();
        this.header = new JLabel();
        this.receipt = new JTextArea();
    }

    public void setGUI(){

    }
}
