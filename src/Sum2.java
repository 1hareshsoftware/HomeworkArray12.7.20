import java.util.Scanner;

public class Sum2 {

    public static void main(String[] args)
    {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in array:");
        num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < num; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of above numbers:"+sum);
    }
}
