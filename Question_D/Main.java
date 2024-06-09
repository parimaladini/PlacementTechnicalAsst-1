 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<99;i++)
        {
            int n = scanner.nextInt();
            sum += n;
        }
        
        int res = 5050 - sum;
        System.out.println(res);
    }
}