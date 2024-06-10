
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp =n, temp1=n;
        int count = 0;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        long sum=0;
        while(temp>0)
        {
            long rem = temp%10;
            sum+=Math.pow(rem,count);
            temp= temp/10;
        }
        if(sum==temp1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}