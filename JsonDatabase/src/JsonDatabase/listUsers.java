package JsonDatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class listUsers {
    //static String replacementText;

    static Scanner scanner = new Scanner(System.in);

     void listFunction() throws IOException, ClassNotFoundException {
         System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name

         String filePath = scanner.nextLine();//read in the file name

         ArrayList<ArrayList<String>> userDatabaseList = new ArrayList<ArrayList<String>>();

         userDatabaseList= JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);

         StringBuffer userData = new StringBuffer();
              for(int i =0 ; i < userDatabaseList.size(); i++) {
                  System.out.println(userDatabaseList.get(i));

              }





    }

}