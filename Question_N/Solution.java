import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        long arr[][] = new long[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        long parimal[][] = new long[cols][rows];

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                parimal[i][j] = arr[j][i];
            }
        }
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(parimal[i][j]+" ");
            }System.out.println();
        }

    }
}