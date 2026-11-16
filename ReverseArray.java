import java.util.Scanner;

public class ReverseArray 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse of array:");

        for (int i = n - 1; i >= 0; i--) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
