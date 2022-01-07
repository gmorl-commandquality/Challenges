package arrays;

public class ArrayClass2 {

    //populated array
    static void populateArray(int arr[][]){
        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
    }

    // print each element using a for loop.
    static void printArray(int arr[][]){

        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    //add 1 to each element in the array.
    static void incrementArray(int arr[][]){
        System.out.println("\n incremented array");
        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] + 1;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[][] = new int[100][30];
        populateArray( arr);
        printArray(arr);
        incrementArray(arr);
        printArray(arr);
    }
}
