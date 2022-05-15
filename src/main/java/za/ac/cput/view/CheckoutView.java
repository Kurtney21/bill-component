package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckoutView extends JFrame implements ActionListener {
    private JPanel center, north, east, south;
    private JLabel header;
    private JTextArea receipt;
    private JButton cashView, cardView;

    public CheckoutView(){
        this.center = new JPanel();
        this.north = new JPanel();
        this.east = new JPanel();
        this.south =  new JPanel();
        this.header = new JLabel("Checkout");
        this.receipt = new JTextArea();
        this.cashView = new JButton("Cash");
        this.cardView = new JButton("Card");

    }

    public void setGUI(){
        this.setLayout(new BorderLayout());
        this.add(center, BorderLayout.CENTER);
        this.add(north, BorderLayout.NORTH);
        this.add(east, BorderLayout.EAST);
        this.add(south, BorderLayout.SOUTH);

        center.setLayout(new FlowLayout(1));
        center.add(receipt);

        north.setLayout(new FlowLayout(1));
        north.add(header);

        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
        east.add(cashView);
        east.add(cardView);

        cashView.addActionListener(this);
        cardView.addActionListener(this);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setSize(600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cash")){
            new CashView().setGUI();
        }
        if(e.getActionCommand().equals("Card")){
          //  new CardView().setGUI();
        }
    }
}
