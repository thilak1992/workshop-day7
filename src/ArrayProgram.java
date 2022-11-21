import java.io.*;
import java.util.*;

public class ArrayProgram {



    public static void main(String args[]) {

       String abc = "";

        int arr[] = {30, 40, 50, 60, 70};
        int n = 5;                  //n = array.length
        int temp = 0;

        for (int i =0; i<n; i++) {

            if(arr[i]%3 == 0)
            {
                abc = abc+arr[i]+"";
            }
            System.out.print(abc);


        }


                // Sorting the array in descending order


        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j< arr.length;j++){
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }


        System.out.print("\n Elements of array sorted in descending order: ");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
