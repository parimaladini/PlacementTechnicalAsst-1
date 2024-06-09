 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0;i<T;i++)
        {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();

            if((A-B)>(C-D))
            {
                System.out.println("Second");
            }
            else if((A-B)<(C-D))
            {
                System.out.println("First");
            }
            else
            {
                System.out.println("Any");
            }
        }
    }
}