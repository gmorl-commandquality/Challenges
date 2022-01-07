package Strings;

public class StringsClass1 {


    // accending method
    static int[][] ascendingOrder(int arr[][]) {

        System.out.println("\n" + "ascending  order");
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr[k].length; i++) {
                for (int j = i + 1; j < arr[k].length; j++) {
                    int temp = 0;
                    if (arr[k][i] > arr[k][j]) {
                        temp = arr[k][i];
                        arr[k][i] = arr[k][j];
                        arr[k][j] = temp;
                    }

                }

            }

        }
        return arr;
    }

    // descending method
    static int[][] descendingOrder(int arr[][]) {

        System.out.println("\n descending  order");
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr[k].length; i++) {
                for (int j = i + 1; j < arr[k].length; j++) {
                    int temp = 0;
                    if (arr[k][i] < arr[k][j]) {
                        temp = arr[k][i];
                        arr[k][i] = arr[k][j];
                        arr[k][j] = temp;
                    }

                }

            }
        }
        return arr;
    }


    static void displayArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {

        String line = "1,4,3,2,3,7,5,6,9\n8,6,3,7,3,7,5,6,9\n";
                ;

        String arr[] = line.split("\n");

        String arrTwo[][] = new String[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            arrTwo[i] = arr[i].split(",");
        }

        int[][] ints = new int[arrTwo.length][arrTwo[0].length];
        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                ints[i][j] = Integer.parseInt(arrTwo[i][j]);

            }

        }

         displayArr(ints);
       descendingOrder(ints);
        displayArr(ints);


    }
}