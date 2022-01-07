package Database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class listUsers {
    //static String replacementText;
    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input

    public static void listFunction() {
        boolean fileRead = readFile();//call the method to read the file with the files name
        if (fileRead) {//if the read file was successfull

            System.out.println("The list End here");
        }
        System.exit(0);//exit once app is done
    }


    private static boolean readFile() {
        System.out.println("/home/matthew/Downloads/Test.txt");//prompt for file name

        filename = sc.nextLine();//read in the file name

        Scanner fileToRead = null;
        try {

            fileToRead = new Scanner(new File(filename)); //point the scanner method to a file
            //check if there is a next line and it is not null and then read it in


            for (String str; fileToRead.hasNextLine() && (str = fileToRead.nextLine()) != null; ) {
                System.out.println(str);//print each line as its read

            }
            fileToRead.close();//this is used to release the scanner from file
            return true;
        } catch (FileNotFoundException ex) {//if the file cannot be found an exception will be thrown
            System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            return false;
        } finally {//if an error occurs now we close the file to exit gracefully
            fileToRead.close();
            return true;
        }

    }

}
