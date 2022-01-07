package Strings;

public class StringsClass {

    // accending method
    static int[] ascendingOrder(int arr[]) {

        System.out.println("\n" +"ascending  order");
      for(int i = 0; i < arr.length; i++){

          for(int j = i +1; j <arr.length; j++)
          {
              int tmp =0;
              if(arr[i] > arr[j])
              {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
              }
          }
      }

        return arr;
    }
    // descending method
   static int[] descendingOrder(int arr[]){

       System.out.println("\n descending  order");
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               int temp =0;
               if (arr[i] < arr[j]) {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }

           }

       }
        return arr;
    }







    static void displayArr(int arr[]){
        for(int i =0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){

        String line = "1,4,3,2,3,7,5,6,9";
        String arr[] = line.split(",");
        int[] ints = new int[arr.length];
        for(int i = 0; i <arr.length; i++){
            ints[i]= Integer.parseInt(arr[i]);
        }

        displayArr(ints);
        ascendingOrder(ints);
        displayArr(ints);
        descendingOrder(ints);
        displayArr(ints);
    }

}
