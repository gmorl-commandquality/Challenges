package Database;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;


public  class Database {
    // calling a the classes
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input
    static UserDatabase db = new UserDatabase();
     static Update userUpdate = new Update();
     static listUsers viewUser = new listUsers();
     static DeleteUser deleteUser1 = new DeleteUser();
     static getUserAge userAge = new getUserAge();
     static  getUserFullname Fname = new getUserFullname();

    public static void main(String args[]) {
        System.out.println("==========================================================================");
        System.out.println("To Add the User please Enter  add");
        System.out.println("To Update the User please Enter  update");
        System.out.println("To list the User please Enter  list");
        System.out.println("To Delete the User please Enter  Delete");
        System.out.println("To get age the User please Enter  age");
        System.out.println("To get fullname the User please Enter  name");
        System.out.println("==========================================================================");


        System.out.println("To get Function the User please Enter  the aboveaa");
        String UserFuction = sc.nextLine();

// while run as you select functions
        while (true) {
  // ada users
            if (UserFuction.contains("add")) {
                db.databaseFunction();
                break;
            }
// update function
            if (UserFuction.contains("update")) {
                userUpdate.updateFunction();
                break;
            }
// print out the list
            if (UserFuction.contains("list")) {
                viewUser.listFunction();
                break;
            }
// delete from the list
            if (UserFuction.contains("delete")) {
                deleteUser1.deleteFunction();
                break;
            }
// get age from the list
            if (UserFuction.contains("age")) {
                userAge.getAgeFunction();
                break;
            }
// get full name from the list
            if (UserFuction.contains("name")) {
                Fname.getFullnameFunction();
                break;
            }
        }

    }
}
