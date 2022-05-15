import za.ac.cput.Entity.Product;
import za.ac.cput.Factory.ProductFactory;
import za.ac.cput.Repository.Implementation.ProductIRepository;
import za.ac.cput.helper.Helper;
import za.ac.cput.view.OrderView;

import java.text.SimpleDateFormat;
import java.util.*;

public class restaurantBill {

    public static void main(String args[]) {

        OrderView orderView = new OrderView();

        // variables
        //Product Input variables
        String id = null;
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;

        //Input Scanner Object
        Scanner scan = new Scanner(System.in);

        //DB Operations and Product Factory for object creation and CRUD
        ProductIRepository db = ProductIRepository.getRepository();
        ProductFactory productFactory = new ProductFactory();

        double overAllPrice = 0.0;
        double cgst = 0, sgst = 0, subtotal = 0.0, discount=0.0;

        System.out.println(Helper.headerBuilder());;

        //input
        String choice = "\0";
        Helper.printDateFormat();

        System.out.print("Enter Customer Name: ");
        String customerName = scan.nextLine();

        do {
            // read input values
            System.out.println("Enter the product details: ");
            System.out.print("Product ID: ");
            id = scan.nextLine();
            System.out.print("Product Name: ");
            productName = scan.nextLine();

            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per unit): ");
            price = scan.nextDouble();
            //calculate total price for a particular product
            totalPrice = price * quantity;
            //calculates overall price
            overAllPrice = overAllPrice + totalPrice;
            //creates Product class object and add it to the List
            db.create( productFactory.createProduct(id, productName, quantity, price, totalPrice) );

            // ask for continue shopping?
            System.out.print("Want to add more items? (y or n): ");
            //reads a character Y or N
            choice = scan.next().substring(0);
            //read remaining characters, don't store (no use)
            scan.nextLine();
        } while (choice.toLowerCase().equals("y"));

        //display all product with its properties
        Helper.displayFormat();

        for (Product p : db.getProducts()) {
            Helper.display(p);
        }

        Helper.printSaleInformation(overAllPrice, discount, subtotal, sgst, cgst);
        // close Scanner
        scan.close();
    }

}
