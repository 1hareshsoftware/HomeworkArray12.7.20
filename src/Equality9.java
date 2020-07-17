import java.util.Arrays;
import java.util.Scanner;

public class Equality9 {

    public static void main(String[] args) {
        int[] num1 = {121, 342, 433, 487, 509, 601};
        int[] num2 = {211, 223, 354, 342, 509, 266};
        int[] num3 = {121, 342, 433, 487};
        System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(num1, num2));
        System.out.println("Is array 1 equal to array 3?? " + Arrays.equals(num1, num3));
    }
}

