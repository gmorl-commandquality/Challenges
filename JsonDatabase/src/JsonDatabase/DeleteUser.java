package JsonDatabase;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteUser {
    //static String replacementText;
    static String filePath = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input




     public void deleteFunction() throws IOException, ClassNotFoundException {
        System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name

        filePath = sc.nextLine();//read in the file name

        System.out.println("Please enter the user Email:");
        String emailKey = sc.nextLine();
        ArrayList<ArrayList<String>> userDatabaseDelete = new ArrayList<ArrayList<String>>();

        userDatabaseDelete = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);

        for (int i = 0; i < userDatabaseDelete.size(); i++) {
            if (userDatabaseDelete.get(i).contains(emailKey)) {
                userDatabaseDelete.remove(i);
            }


        }
         JSONSerializationHelper.serialiseToFile(userDatabaseDelete, filePath);
    }
}