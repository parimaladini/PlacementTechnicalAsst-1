 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextLong();
        }
        int flag= 0;

        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                System.out.println(i);
                flag = 1;
            }
        }

        if(flag==0)
        {
            System.out.println(-1);
        }
    }
}