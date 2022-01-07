package JsonDatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class listUsers {
    //static String replacementText;

    static String filePath = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input


     static void listFunction() throws IOException, ClassNotFoundException {
        System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name

        filePath = sc.nextLine();//read in the file name
         ArrayList<ArrayList<String>> userDatabaseList = new ArrayList<ArrayList<String>>();

         userDatabaseList= JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);

         for (int i = 0; i < userDatabaseList.size(); i++) {

             System.out.println(userDatabaseList.get(i));


         }
         JSONSerializationHelper.serialiseToFile(userDatabaseList, filePath);

        System.out.println("The list End here");


    }

}