

import java.util.Scanner;

public class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long count_A = 0, count_B=0;

        for(int i=1; i<=N; i++){
            if(i%3==0 || i%5==0){
                count_A++;
            }

            if(i%15==0){
                count_B++;
            }
            
        }

        System.out.println(count_A-count_B);
    }
}