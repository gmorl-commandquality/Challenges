package arrays;

public class ArrayClass1 {

    //populated array
    static void populateArray(int arr[]){
        int i =0;
        while (i < arr.length){
            arr[i]=i+1;
            i++;
        }

    }

    // print each element using a for loop.
    static void printArray(int arr[]){

        int i =0;
        while (i < arr.length) {

            // print even number and numbers divisible by 11 only.

            boolean bool =false;
            bool = ((arr[i]%2==0) || (arr[i]%11==0));

            int val = (bool) ? 1 : 0;

            switch (val) {
                case 1: System.out.print(arr[i] + " ");
                break;
            }
            i++;
        }
    }

    //add 1 to each element in the array.
    static void incrementArray(int arr[]){
        System.out.println("\n incremented array");
        int i =0;
        while(i < arr.length){
            arr[i]=arr[i]+1;
            i++;
        }

    }

    public static void main(String args[])
    {
        int arr[] = new int[50];
        populateArray( arr);
        printArray(arr);
        incrementArray(arr);
        printArray(arr);
    }
}

