import java.util.Arrays;
import java.util.Scanner;

public class Reverse6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int a = sc.nextInt();

        //declare array
        int arr [] = new int[a];

        System.out.println("Enter array values");
        //input array values

        for(int i = 0; i < a ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int temp;
        int start = 0;
        int end = a-1;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Print array after reverse");

        for (int j=0; j < a; j++){
            System.out.println(arr[j]);
        }
    }
}
