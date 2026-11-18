
import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, rem, rev = 0, original;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        original = n;

        while (n > 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (original == rev)
        {
            System.out.println("Palindrome ");
        }
        else
        {
            System.out.println("Not  Palindrome ");
        }
    }
}
