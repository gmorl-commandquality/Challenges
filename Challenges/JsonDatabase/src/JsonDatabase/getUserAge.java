package JsonDatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class getUserAge {
    //static String replacementText;
    static String filePath = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input




    public void getAgeFunction() throws IOException, ClassNotFoundException {
        System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name

        filePath = sc.nextLine();//read in the file name

        System.out.println("Please enter the user Email:");
        String emailKey = sc.nextLine();
        ArrayList<ArrayList<String>> userDatabaseDelete = new ArrayList<ArrayList<String>>();

        userDatabaseDelete = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);

        for (int i = 0; i < userDatabaseDelete.size(); i++) {
            if (userDatabaseDelete.get(i).contains(emailKey)) {

                String year = userDatabaseDelete.get(i).get(3).split("/")[2];
                int yearsold = 2021- Integer.parseInt(year);
                System.out.println(userDatabaseDelete.get(i).get(1)+" is "+ yearsold+ " years old");

            }


        }
        JSONSerializationHelper.serialiseToFile(userDatabaseDelete, filePath);
    }
}
