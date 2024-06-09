

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int total = 5050;
        for(int i=0; i<99; i++){
            sum += sc.nextInt();
        }

        System.out.println(total-sum);
    }
}