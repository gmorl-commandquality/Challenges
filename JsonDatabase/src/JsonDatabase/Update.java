package JsonDatabase;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Update {


    //static String replacementText;
      static String filePath = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input


        public static void updateFunction() throws IOException, ClassNotFoundException {
        System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name

        filePath = sc.nextLine();//read in the file name

            System.out.println("Please enter the user Email:");
            String emailKey = sc.nextLine();

            System.out.println("Please enter the name you like to Update email/name/sur and dob:");
            String updateName = sc.nextLine();





            System.out.println("Please enter the contents of a line you would like to edit: ");//prompt for a line in file to edit
            String  newInput = sc.nextLine();//read the line to edit






                int index = 0;

                if(updateName=="email"){ index = 2;}
                if(updateName=="name"){ index = 0;}
            if(updateName=="sur"){ index = 1;}
            if(updateName=="dob"){ index = 3;}

            ArrayList<ArrayList<String>> userDatabaseUpdate = new ArrayList<ArrayList<String>>();
            userDatabaseUpdate = JSONSerializationHelper.deserializeFromFile(filePath, ArrayList.class);

            for (int i = 0; i < userDatabaseUpdate.size(); i++) {
                if (userDatabaseUpdate.get(i).contains(emailKey)) {

                    userDatabaseUpdate.get(i).set(index,newInput);

                }


            }
            JSONSerializationHelper.serialiseToFile(userDatabaseUpdate, filePath);
    }
}