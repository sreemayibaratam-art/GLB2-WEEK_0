import java.util.Scanner;

class Sum 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        
        System.out.println("Enter how many numbers:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            System.out.println("Enter number:");
            int num = sc.nextInt();

            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
