 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            if(n>x)
            {
                n = n-x;
                x = n/4 + ((n%4==0)?0:1);
            }
            else
            {
                x = 0;
            }
            
            System.out.println(x);
            
        }
    }
}