import java.util.Scanner;

public class ArraySum 
{
    public static void main(String args []) 
    {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        int sum = 0;

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
