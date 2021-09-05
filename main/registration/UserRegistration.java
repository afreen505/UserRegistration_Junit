package registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidationInterface {
    boolean validate(String userInput);
}

public class UserRegistration {
    public static void main(String args[]) {

        //validating the first name of the user
        UserValidationInterface validateFirstName = (firstName) -> {
            String regex = "^[A-Z][a-z]{2,}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(firstName);
            boolean b = m.matches();
            if (b) {
                System.out.println("First Name of the user is valid.");
                return true;
            } else {
                System.out.println("First Name of the user is invalid.");
            }
            return false;
        };
        validateFirstName.validate("Afreen");

        //validating the last name of the user
        UserValidationInterface validateLastName = (lastName) -> {
            String regex = "^[A-Z][a-z]{2,}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(lastName);
            boolean b = m.matches();
            if (b) {
                System.out.println("Last Name of the user is valid.");
                return true;
            } else {
                System.out.println("Last Name of the user is invalid.");
            }
            return false;
        };
        validateLastName.validate("Fathima");

        //validating the email Id of the user
        UserValidationInterface validateEmailId = (emailId) -> {
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
        };
        validateEmailId.validate("abc.xyz@bl.co.in");

        //validating the mobile number of the user
        UserValidationInterface validatePhoneNumber = (mobileNumber) -> {
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
        };
        validatePhoneNumber.validate("91 987654321");

        //validating the password of the user
        UserValidationInterface validatePassword = (password) -> {
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
        };
        validatePassword.validate("oneFine$123");

    }

}