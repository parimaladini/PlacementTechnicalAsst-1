
import java.util.Scanner;


public class Solution{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        while(test_cases-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            if(N<X){
                System.out.println(0);
            }
            else{
                if((N-X)<=4){
                    System.out.println(1);
                }
                else{
                    if((N-X)%4==0){
                        System.out.println((N-X)/4);
                    }
                    else
                    System.out.println(((N-X)/4)+1);
                }
            }

        }
    }
}