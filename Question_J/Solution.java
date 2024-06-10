

import java.util.Scanner;

public class Solution{
    public static void main(String args[]){

      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int K = sc.nextInt();
      boolean flag = false;

      long[] arr = new long[N];

      for(int i=0; i<N; i++){
        arr[i]=sc.nextInt();
      }

      for(int i=0; i<N; i++){
        if(arr[i]==K){
            System.out.println(i); flag=true; break;
        }
      }

      if(!flag){
        System.out.println(-1);
      }
    }


}