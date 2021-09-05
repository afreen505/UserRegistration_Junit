package registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);

    /**
     * UC-1 This method is validating the first name of the user is correct or not.
     */
    public boolean validateFirstName(String name) {
        String regex = "^[A-Z][a-z]{2,}";
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

    /**
     * UC-2 This method is validating the last name of the user is correct or not.
     */
    public boolean validateLastName(String name) {
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
    public boolean validateEmail(String emailId) {
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
    public boolean validateMobileNo(String mobileNumber) {
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

    /**
     * UC-5 This method is validating the first rule of password of the user is
     * correct or not. It should minimum of 8 characters.
     * <p>
     * UC-6 This method is validating the second rule of password of the user is
     * correct or not. It should contain at least one upper case.
     * <p>
     * UC-7 This method is validating the third rule of password of the user is
     * correct or not. It should contain at least one numeric value.
     * <p>
     * UC-8 This method is validating the third rule of password of the user is
     * correct or not. It should contain one special character.
     */
    public boolean validatePassword(String password) {
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

    /**
     * UC-9 Validating the given sample emailId
     */
    public boolean checkMultipleEmail(String email) {
        return email.matches("^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$");
    }

}