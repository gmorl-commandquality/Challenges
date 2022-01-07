package JsonDatabase;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.io.*;


public class UserDatabase {

    static Validate valid1 = new Validate();
    static  boolean check =true;
    static Scanner scanner = new Scanner(System.in);





    //Menu Options methods
    //Add a user
    static void addUser( String filePath) throws IOException, ClassNotFoundException {
        ArrayList<ArrayList<String>> userDatabase1 = new ArrayList<ArrayList<String>>();
        try {
            userDatabase1 = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);

        }catch (Exception e){
            System.out.print("");
        }
            String userName = getUserName();

            String userSurname = getUserSurname();

            String userEmail = getUserEmail();


            String dob = getUserDOB();


            userDatabase1.add(new ArrayList<>(Arrays.asList(userName,userSurname,userEmail,dob)));

            JSONSerializationHelper.serialiseToFile(userDatabase1, filePath);
            int year = Integer.parseInt(dob.split("/")[2]);
            int age = 2021 - year;            //Calculate age
            System.out.println("You are " + age + " years old");
            System.out.println("Hello " + userName + " " + userSurname +
                    " your details have been saved. \n");
        }



    /*Takes user name input and check if it's valid and
   returns the name if it's valid
   */
    static String getUserName() {
        String name = null;
        while (true) {
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();
            try {
                if (true == valid1.validateName(name)) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Surname Invalid!");
            }
        }
        return name;
    }

    /*Takes user surname input and check if it's valid and returns
the surname if it's valid.
*/
    static String getUserSurname() {
        String surname = null;
        while (true) {
            System.out.print("Enter your surname: ");
            surname = scanner.nextLine();
            try {
                if (true == valid1.validateName(surname)) {
                   break;
                }
            } catch (Exception e) {
                System.out.println("Surname Invalid!");
            }
        }
        return surname;
    }


    /*Takes user email input and check if it's valid and returns
    the email if it's valid.
    */
    static String getUserEmail() {
        String email;
        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();

            if (true == true==valid1.validateUserEmail(email)) {
                break;
            }

        }
        return email;
    }

    /*Take user date of birth input and check if it's valid and returns
    the date of birth if it's valid.
    */
    static String getUserDOB(){
        String dob;
        int yearCheck;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while(true){
            System.out.print("Enter your date of birth(dd/MM/yyyy): ");
            dob = scanner.nextLine();
            try{
                Date date = dateFormat.parse(dob);
                if(dob.length() == 10){
                    yearCheck = Integer.parseInt(dob.split("/")[2]);
                    if(yearCheck < 2021){
                        return dob;
                    }else{
                        System.out.println("Can't be born in the future");
                    }
                }else{
                    System.out.println("Date format not valid");
                }
            }catch(Exception e){
                System.out.println("Date of birth is not valid");
            }
        }
    }
    //End of user details methods


    }

