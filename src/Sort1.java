import java.util.Arrays;
import java.util.Scanner;


public class Sort1 {

    public static void main(String [] args){
        int[] num = {98,87,76,54,43,22,54,9};

        String[] alphabet = {"India", "USA", "Canada", "UK", "Russia"};
        Arrays.sort(num);
        System.out.println("Numeric : "+Arrays.toString(num));

        Arrays.sort(alphabet);
        System.out.println("String: "+Arrays.toString(alphabet));
            }
    }




