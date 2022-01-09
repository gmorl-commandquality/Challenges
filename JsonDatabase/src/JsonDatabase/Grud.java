package JsonDatabase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.io.*;

public class Grud {


    static Validate valid1 = new Validate();
    static UserDatabase t= new UserDatabase();
    static Scanner scanner = new Scanner(System.in);

    /*Takes an arraylist of emails and first checks if it's not empty
    then check if the user exists and updates the details.
    */
    static void updateUserDetails(ArrayList<String> name, ArrayList<String> surname,
                                  ArrayList<String> emails,
                                  ArrayList<String> dateOfBirth, String filePath) throws IOException, ClassNotFoundException {
        ArrayList<ArrayList<String> > userDatabase;
        int updateOption;
        String userName;
        String userSurname;
        String userEmail;
        String dob;
        try{
            userDatabase = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);
            name = userDatabase.get(0);
            surname = userDatabase.get(1);
            emails = userDatabase.get(2);
            dateOfBirth = userDatabase.get(3);
            valid1.lengthOfList(emails);
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            int check = emails.size();
            for(int i = 0; i < emails.size(); i++){
                // check if email is in database
                if(email.equalsIgnoreCase(emails.get(i))){
                    System.out.println("Name: "+ name.get(i) + "\tSurname: "
                            + surname.get(i) + "\tEmail: " +
                            emails.get(i) + "\tDOB " +
                            dateOfBirth.get(i));
                    check--;
                    updateOption = updateMenuOption();
                    if(updateOption == 1){ //update name
                        userName = t.getUserName();
                        name.set(i, userName);
                    }else if(updateOption == 2){  //update surname
                        userSurname = t.getUserSurname();
                        surname.set(i, userSurname);
                    }else if(updateOption == 3){  //update email
                        userEmail = t.getUserEmail();
                        emails.set(i, userEmail);
                    }else if(updateOption == 4){  //update date of birth
                        dob = t.getUserDOB();
                        dateOfBirth.set(i, dob);
                    }else if(updateOption == 5){ //  //update all details
                        userName = t.getUserName();
                        name.set(i, userName);
                        userSurname = t.getUserSurname();
                        surname.set(i, userSurname);
                        userEmail = t.getUserEmail();
                        emails.set(i, userEmail);
                        dob = t.getUserDOB();
                        dateOfBirth.set(i, dob);
                    }
                    JSONSerializationHelper.serialiseToFile(userDatabase, filePath);
                }
            }
            if(check == emails.size()){
                System.out.println("User not found");
            }

        }catch(Exception e){
            System.out.println("No users available");
        }
    }


    /*Displays options to user when they want to update
    and returns the option*/
    static int updateMenuOption(){
        Scanner scannerMenu = new Scanner(System.in);

        int option;
        while(true){
            System.out.println("---------------Update Details----------------");
            System.out.println("(1) Name \t\t (2) Surname \n");
            System.out.println("(3) Email \t\t (4) Date of birth \n");
            System.out.println("(5) All Details \n");
            System.out.println("-----------------------------------");
            System.out.print("Choose an option(1-5) : ");
            try{
                option = scannerMenu.nextInt();
                if(option >= 1 && option <= 5){
                    break;
                }

            }catch(Exception e){
                System.out.println("Option not valid");
                scannerMenu.next();
            }
        }
        return option;
    }


    /*Takes an arraylist of emails and first checks if it's not empty
    then check if the user exists and deletes user if email matches ones
    stored in database.
    */
    static void deleteUserDetails(ArrayList<String> name, ArrayList<String> surname,
                                  ArrayList<String> emails,
                                  ArrayList<String> dateOfBirth, String filePath) throws IOException, ClassNotFoundException {
        ArrayList<ArrayList<String> > userDatabase;
        try{
            userDatabase = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);
            name = userDatabase.get(0);
            surname = userDatabase.get(1);
            emails = userDatabase.get(2);
            dateOfBirth = userDatabase.get(3);
            valid1.lengthOfList(emails);  	//Check size of arraylist
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            int temp = emails.size();
            for(int i = 0; i < emails.size(); i++){
                if(email.equalsIgnoreCase(emails.get(i))){
                    String tempName = name.get(i);
                    String tempsurname = surname.get(i);
                    name.remove(i);
                    surname.remove(i);
                    emails.remove(i);
                    dateOfBirth.remove(i);
                    System.out.println("User "+ tempName + " " + tempsurname+
                            " has been deleted");
                    i--;
                }
                JSONSerializationHelper.serialiseToFile(userDatabase, filePath);
            }if(temp == emails.size()){
                System.out.println("User not found!");
            }
        }catch(Exception e){
            System.out.println("No users available");
        }
    }

    // List all users
    // If list is empty System.out.println("No Users available");
    static void listUsers(ArrayList<String> name, ArrayList<String> surname,
                          ArrayList<String> emails,
                          ArrayList<String> dateOfBirth, String filePath) throws IOException, ClassNotFoundException {
        ArrayList<ArrayList<String> > userDatabase;
        try{
            userDatabase = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);
            name = userDatabase.get(0);
            surname = userDatabase.get(1);
            emails = userDatabase.get(2);
            dateOfBirth = userDatabase.get(3);
            valid1.lengthOfList(emails);  	//Check size of arraylist
            for(int i = 0; i < name.size(); i++){
                System.out.println(name.get(i) + " " + surname.get(i) + " " +
                        emails.get(i) + " " + dateOfBirth.get(i));
            }

        }catch (Exception e){
            System.out.println("No users available");
        }
    }
    //End of menu options methods




}
