package za.ac.cput.helper;

import org.apache.commons.validator.routines.*;

import java.util.UUID;

public class Helper {

    public static boolean isEmpty(String t){
        return (t.equals(null) || t.isEmpty() || t.equals("") || t.equalsIgnoreCase("null"));
    }

    public static boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

    public static String headerBuilder(){
        return"\n\t\t\t\t--------------------Receipt-----------------" +
                "\n\t\t\t\t\t "+"  "+"Sons of Strategy Restaurant" +
                "\n\t\t\t\t\t12 AppdevTheory District Six, CPUT\n";
    }
}
