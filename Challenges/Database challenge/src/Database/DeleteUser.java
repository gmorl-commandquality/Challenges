package Database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class DeleteUser {
    //static String replacementText;
    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input

    public static void deleteFunction() {
        boolean fileRead = readFile();//call the method to read the file with the files name
        if (fileRead) {//if the read file was successfull
            writeToFile();
            System.out.println("Delete was successful");
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

            System.out.println("Please enter the user Email:");
            String emailKey = sc.nextLine();


            for (String str; fileToRead.hasNextLine() && (str = fileToRead.nextLine()) != null; ) {

                 if(str.contains(emailKey)){

                 }else{
                     stringBufferOfData.append(str).append("\r\n");
                 }


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

    private static void writeToFile() {
        try {
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
            bufwriter.close();//closes the file
        } catch (Exception e) {//if an exception occurs
            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }
    }

}
