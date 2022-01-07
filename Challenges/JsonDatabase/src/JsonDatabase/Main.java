package JsonDatabase;

import java.io.IOException;
import java.util.*;



public class Main {
   static String filePath = null;
   static Scanner scanner = new Scanner(System.in);
   static UserDatabase t= new UserDatabase();
   static  DeleteUser  D = new DeleteUser();
   static  listUsers  L = new listUsers();
   static  getUserAge A = new getUserAge();

   public static void main(String[] args) throws IOException, ClassNotFoundException {


      System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name
      filePath = scanner.nextLine();//read in the file name

      	/*While loop ensure that the program doesn't terminate but keeps
		showing the user the menu*/


        		//Add option

           // t.addUser( filePath);
          //  D.deleteFunction();
            L.listFunction();


      }
   }



