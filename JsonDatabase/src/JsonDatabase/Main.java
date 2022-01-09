package JsonDatabase;
import java.io.*;
import java.util.Scanner;


public  class Main{
    // calling a the classes
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input
    static UserDatabase db = new UserDatabase();
    static Update userUpdate = new Update();
    static listUsers viewUser = new listUsers();
    static DeleteUser deleteUser1 = new DeleteUser();
    static getUserAge userAge = new getUserAge();


    public static void main(String args[]) throws IOException, ClassNotFoundException {
        System.out.println("==========================================================================");
        System.out.println("To Add the User please Enter  add");
        System.out.println("To Update the User please Enter  update");
        System.out.println("To list the User please Enter  list");
        System.out.println("To Delete the User please Enter  delete");
        System.out.println("To get age the User please Enter  age");
        System.out.println("==========================================================================");


        System.out.println("To get Function the User please Enter  the aboveaa");
        String UserFuction = sc.nextLine();

// while run as you select functions
        while (true) {
            // ada users
            if (UserFuction.contains("add")) {
                db.addUser();
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

        }

    }
}