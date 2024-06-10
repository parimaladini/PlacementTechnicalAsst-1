 
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int arr[][] = new int[R][C];

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<R; i++){
            int sum=0;
            for(int j=0; j<C; j++){
                sum += arr[j][i];
            }
            System.out.println(sum);
        }



    }
}