package za.ac.cput.view;

import za.ac.cput.Entity.Order;
import za.ac.cput.Factory.ProductFactory;
import za.ac.cput.Repository.Implementation.ProductIRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OrderView extends JFrame implements ActionListener {
    ArrayList<Double> totals = new ArrayList<Double>();
    private ArrayList<Order> orderList = new ArrayList<Order>();
    private JPanel north, south, center, east, west;
    private JLabel header, custNameLbl, tableNumberLbl, qtyLbl, priceLbl, productNameLbl, totalLbl;
    private JButton add, done;
    private JTextField custTxt, tableTxt, qtyTxt, priceTxt, productNameTxt;
    ProductIRepository db = ProductIRepository.getRepository();
    ProductFactory productFactory = new ProductFactory();


    public OrderView() {
        super("SOS");
        this.north = new JPanel();
        this.south = new JPanel();
        this.center = new JPanel();
        this.east = new JPanel();
        this.west = new JPanel();

        this.header = new JLabel("RMS", JLabel.CENTER );
        this.custNameLbl = new JLabel("Customer Name");
        this.productNameLbl = new JLabel("Product Name");
        this.tableNumberLbl = new JLabel("Table Number");
        this.qtyLbl = new JLabel("QTY");
        this.priceLbl = new JLabel("Price");
        this.totalLbl = new JLabel("R 0.00");


        this.add = new JButton("Add");
        this.done = new JButton("Done");

        this.custTxt = new JTextField(15);
        this.tableTxt= new JTextField(15);
        this.qtyTxt = new JTextField(15);
        this.priceTxt = new JTextField(15);
        this.productNameTxt = new JTextField(15);
    }

    public void setGUI(){
        //Adding Panels to JFrame
        this.setLayout(new BorderLayout());
        this.add(north, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(south, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);

        //Setting layouts
        north.setLayout(new FlowLayout(1));
        center.setLayout(new GridLayout(5,2));
        south.setLayout(new FlowLayout(2));
        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));

        //East
        east.add(totalLbl);
        east.add(Box.createRigidArea(new Dimension(56,60)));

        //West
        west.add(Box.createRigidArea(new Dimension(56,60)));

        //North Panel
        north.add(header);

        //Center Panel
        center.add(custNameLbl);
        center.add(custTxt);

        center.add(tableNumberLbl);
        center.add(tableTxt);

        center.add(productNameLbl);
        center.add(productNameTxt);

        center.add(qtyLbl);
        center.add(qtyTxt);

        center.add(priceLbl);
        center.add(priceTxt);

        //South Panel
        south.add(add);
        south.add(done);

        add.addActionListener(this);
        done.addActionListener(this);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setSize(600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        OrderView viewTest = new OrderView();
        viewTest.setGUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String tableId = this.tableTxt.getText();
        String custName = this.custTxt.getText();

        //add Validation Here
        int quantity = (Integer) Integer.parseInt(this.qtyTxt.getText());
        double price = (Double) Double.parseDouble(this.priceTxt.getText());
        double total = quantity * price;
        totals.add(total);

        for(int i = 0; i < totals.size(); i++){
            total = total + totals.get(i);
        }

        if(e.getActionCommand().equals("Add")){
            orderList.add( new Order(tableId,custName,quantity,price));
            this.tableTxt.setText("");
            this.custTxt.setText("");
            this.qtyTxt.setText("");
            this.productNameTxt.setText("");
            this.priceTxt.setText("");
            this.totalLbl.setText("R " + total);

            orderList.forEach((n) ->{
                System.out.println(n);
            });

        }else if(e.getActionCommand().equals("Done")){
            orderList.forEach((n) ->{
                System.out.println(n);
            });
        }
    }
}
