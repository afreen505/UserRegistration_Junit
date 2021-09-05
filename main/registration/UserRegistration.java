package registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) throws ValidationException {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);
        if (firstName == null) {
            return false;
        }
        Matcher m = p.matcher(firstName);
        boolean b = m.matches();
        if (b) {
            return true;
        } else {
            throw new ValidationException("Please enter valid name");
        }
    }

    public boolean validateLastName(String lastName) throws ValidationException {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);
        if (lastName == null) {
            return false;
        }
        Matcher m = p.matcher(lastName);
        boolean b = m.matches();
        if (b) {
            return true;
        } else {
            throw new ValidationException("Please enter valid name");
        }
    }


    public boolean validateEmail(String emailId) throws ValidationException {
        String regex = "^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        if (emailId == null) {
            return false;
        }
        boolean b = m.matches();
        if (b) {
            return true;
        } else {
            throw new ValidationException("Please enter valid email Id");
        }

    }

    public boolean validateMobileNo(String mobileNumber) throws ValidationException {
        String regex = "[0-9]{2}\\s{1}[0-9]{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        if (mobileNumber == null) {
            return false;
        }
        boolean b = m.matches();
        if (b) {
            return true;
        } else {
            throw new ValidationException("Please enter valid phone number");
        }

    }

    public boolean validatePassword(String password) throws ValidationException {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (password == null) {
            return false;
        }
        boolean b = m.matches();
        if (b) {
            return true;
        } else {
            throw new ValidationException("Please enter valid password");
        }

    }

    public static void main(String[] args) throws ValidationException {
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String firstName = scanner.nextLine();
        user.validateFirstName(firstName);

        System.out.println("Enter the Last Name: ");
        String lastName = scanner.nextLine();
        user.validateLastName(lastName);

        System.out.println("Enter the Email Id: ");
        String emailId = scanner.nextLine();
        user.validateEmail(emailId);

        System.out.println("Enter the Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        user.validateMobileNo(mobileNumber);

        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        user.validatePassword(password);
        scanner.close();
    }

}
