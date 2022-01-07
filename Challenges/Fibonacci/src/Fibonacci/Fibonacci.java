package Fibonacci;

import java.util.*;

public class Fibonacci {

    //Fibonacci  function
    static int[] Fib(int x){

            int arr[] = new int[x + 1];
            try {
                for (int i = 0; i < arr.length; i++) {
                    if (i == 0) {
                        arr[i] = 0;
                    } else if (i == 1) {
                        arr[i] = 1;
                    } else {
                        arr[i] = arr[i - 1] + arr[i - 2];
                    }
                }
            }catch (Exception e) {
                System.out.println("\nException caught");
            }

        return arr;
    }

    // Display Fibonacci  function
   static void displayFib(int arr[]) {

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch (Exception e) {
            System.out.println("\nException caught");
        }
    }


    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the nth number of the fibonacci sequence to print out:");
        int n = sc.nextInt();

        int arr[] =Fib(n);
        displayFib(arr);
    }
}
