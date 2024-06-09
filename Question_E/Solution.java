// Sum of Squares of first N natural numbers.

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int numer = N*(N+1)*((2*N)+1);
        int denom = 6;

        System.out.println(numer/denom);

        
    }
}