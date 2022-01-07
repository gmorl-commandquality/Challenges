package Database;

import java.util.*;

public class AddUser {

    String name;
    String Surname;
    String userEmail;
    String dateOfbirth;
    Validate valid1 = new Validate();

    void userInput() {

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream

        while (true) {
            System.out.println("Enter your Name:");
            name = sc.nextLine();
            if (true==valid1.validateName(name)) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter your Surname:");
            Surname = sc.nextLine();
            if (true==valid1.validateSurname(Surname)) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter your email:");
            userEmail = sc.nextLine();
            if (true==valid1.validateUserEmail(userEmail)) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter your Date of birth:");
            dateOfbirth = sc.nextLine();
            if (true==(valid1.validateDateofBirth(dateOfbirth))) {
                break;
            }
        }


    }

    String storeDate() {

        return userEmail +"-"+name+"-"+Surname+"-"+dateOfbirth;
    }
}