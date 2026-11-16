import java.util.Scanner;

public class EvenPlaces 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0, place = 1;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;

            if (place % 2 == 0) 
            {
                sum = sum + digit;
            }

            n = n / 10;
            place++;
        }

        System.out.println("Sum of even places = " + sum);
    }
}

