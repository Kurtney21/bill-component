import za.ac.cput.Entity.Product;
import za.ac.cput.Factory.ProductFactory;
import za.ac.cput.Repository.Implementation.ProductIRepository;

import java.text.SimpleDateFormat;
import java.util.*;

public class restaurantBill {

    public static void main(String args[])
    {
        /*
        // variables
        //Product
        String id = null;
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
*/
        ProductIRepository db = ProductIRepository.getRepository();
        ProductFactory productFactory = new ProductFactory();
        Product prod;

        double overAllPrice = 0.0;
        double cgst, sgst, subtotal=0.0, discount=0.0;

        //input
        char choice = '\0';


        System.out.println("\n\t\t\t\t--------------------Receipt-----------------");
        System.out.println("\t\t\t\t\t "+"  "+"Sons of Strategy Restaurant");
        System.out.println("\t\t\t\t\t12 AppdevTheory District Six, CPUT\n");

        //format of date and time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        //prints current date and time
        System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customername=scan.nextLine();
        //create Scanner class object

        //creating an ArrayList to store the product
        List<Items> product = new ArrayList<Items>();
        do
        {
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
            product.add( new Items(id, productName, quantity, price, totalPrice) );

            // ask for continue shopping?
            System.out.print("Want to add more items? (y or n): ");
            //reads a character Y or N
            choice = scan.next().charAt(0);
            //read remaining characters, don't store (no use)
            scan.nextLine();
        }
        while (choice == 'y' || choice == 'Y');
        //display all product with its properties
        Items.displayFormat();
        for (Items p : product)
        {
            p.display();
        }
        //price calculation
        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);
        //calculating discount
        discount = overAllPrice*2/100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " +discount);
        //total amount after discount
        subtotal = overAllPrice-discount;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);
        //calculating tax
        sgst=overAllPrice*12/100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst);
        cgst=overAllPrice*12/100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst);
        //calculating amount to be paid by buyer
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));
        System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
        System.out.println("\t\t\t\t                     Visit Again");
        // close Scanner
        scan.close();
    }

}
