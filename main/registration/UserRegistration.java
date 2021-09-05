package registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public boolean validateFirstName(String name) {
        String regex = "^[A-Z][a-z]{3,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        if (b) {
            System.out.println("First Name of the user is valid.");
            return true;
        } else {
            System.out.println("First Name of the user is invalid.");
        }
        return false;
    }

    public static boolean validateLastName(String name) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        if (b) {
            System.out.println("Last Name of the user is valid.");
            return true;
        } else {
            System.out.println("Last Name of the user is invalid.");
        }
        return false;
    }

    /**
     * UC-3 This method is validating the email id of the user is correct or not.
     */
    public static boolean validateEmail(String emailId) {
        String regex = "^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean b = m.matches();
        if (b) {
            System.out.println("Email Id of the user is valid.");
            return true;
        } else {
            System.out.println("Email Id of the user is invalid.");
        }
        return false;

    }

    /**
     * UC-4 This method is validating the Mobile number of the user is correct or
     * not.
     */
    public static boolean validateMobileNo(String mobileNumber) {
        String regex = "[0-9]{2}\\s{1}[0-9]{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        boolean b = m.matches();
        if (b) {
            System.out.println("Mobile number of the user is valid.");
            return true;
        } else {
            System.out.println("Mobile number of the user is invalid.");
        }
        return false;

    }

    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        if (b) {
            System.out.println("password of the user is valid.");
            return true;
        } else {
            System.out.println("password of the user is invalid.");
        }
        return false;

    }

}

