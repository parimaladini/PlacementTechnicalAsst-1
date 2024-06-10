

import java.util.Scanner;

public class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        boolean result = checkArmstrong(N);
        if(result)
        System.out.println("Yes");
        else
        System.out.println("No");


    }

    public static boolean checkArmstrong(long n){
        long sum=0;
        long N = n;
        while(N>0){
            long rem = N%10;
            sum += rem*rem*rem;
            N=N/10;
        }

        if(sum==n)
        return true;
        else
        return false;
    }
}