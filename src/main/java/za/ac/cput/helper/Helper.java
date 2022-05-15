package za.ac.cput.helper;

import org.apache.commons.validator.routines.*;
import za.ac.cput.Entity.Product;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Helper {
    private static String line = "-----------------------------------------------------------------------------------------------------------------------------------";

    public static boolean isEmpty(String t){
        return (t.equals(null) || t.isEmpty() || t.equals("") || t.equalsIgnoreCase("null"));
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

    public static String headerBuilder(){
        return"\n\t\t\t\t--------------------Receipt-----------------" +
                "\n\t\t\t\t\t "+"  "+"Sons of Strategy Restaurant" +
                "\n\t\t\t\t\t12 AppdevTheory District Six, CPUT\n";
    }

    public static void displayFormat() {
        System.out.format(line);
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
        System.out.format(line);
    }

    public static void printDateFormat(){
        //format of date and time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        //prints current date and time
        System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
    }

    public static void display(Product product) {
        System.out.format("\n   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,product.getId(), product.getProductName(),
                product.getQuantity(), product.getPrice(), product.getTotalPrice());
    }

    public static void printSaleInformation(double overAllPrice,double discount, double subtotal, double sgst, double cgst){
        //price calculation
        System.out.println("\nTotal Amount (Rs.) " +overAllPrice);
        //calculating discount
        discount = overAllPrice*2/100;
        System.out.println("\nDiscount (Rs.) " +discount);
        //total amount after discount
        subtotal = overAllPrice-discount;
        System.out.println("\nSubtotal "+subtotal);
        //calculating tax
        sgst=overAllPrice*12/100;
        System.out.println("\nSGST (%) "+sgst);
        cgst=overAllPrice*12/100;
        System.out.println("\nCGST (%) "+cgst);
        //calculating amount to be paid by buyer
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));
        System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
        System.out.println("\t\t\t\t                     Visit Again");
    }




}
