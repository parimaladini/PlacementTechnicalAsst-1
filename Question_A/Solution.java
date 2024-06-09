 
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt();

        while(test_cases-->0){

            // Taking the prices input
            int A = sc.nextInt(); 
            int B = sc.nextInt();

            // Taking the discounts input
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Final price with discount
            int final_A = A-X;
            int final_B = B-Y;

            if(final_A>final_B)
            System.out.println("Second");
            else if(final_A==final_B)
            System.out.println("Any");
            else
            System.out.println("First");


        }
    }
}