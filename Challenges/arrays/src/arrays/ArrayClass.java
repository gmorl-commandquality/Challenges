package arrays;

public class ArrayClass {

    //populated array
   static void populateArray(int arr[]){
        for(int i =0; i < arr.length; i++){
            arr[i]=i+1;
        }
    }

    // print each element using a for loop.
   static void printArray(int arr[]){

        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //add 1 to each element in the array.
    static void incrementArray(int arr[]){
        System.out.println("\n incremented array");
        for(int i =0; i < arr.length; i++){
            arr[i]=arr[i]+1;
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
