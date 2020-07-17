import java.util.Scanner;

public class Duplicate7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int a = sc.nextInt();

        //declare array
        int arr[] = new int[a];

        System.out.println("Enter array values");
        //input array values

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
                else
                    System.out.println("No Duplicates");
            }
        }
    }
}
