 

import java.util.Scanner;

public class Solution{
    public static void main(String args[]){

      Scanner sc = new Scanner(System.in);

      int test_cases = sc.nextInt();
      while(test_cases-->0){
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
          arr[i] = sc.nextInt();
        }

        int arrs[] = new int[N];
        int temp[] = new int[2];
        int inc = 0;
        for(int i=0; i<N; i++){
          if(arrs[arr[i]]==1){
            temp[inc++]=arr[i];
          }
          else{
            arrs[arr[i]]++;
          }
        }

        System.out.println(temp[0]+" "+temp[1]);
      }

    }


}