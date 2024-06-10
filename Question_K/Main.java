 
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            
            int size = arr.length;
            
    
            int count[] = new int[size];
            int i;
    
            int zero=0;
            int temp[] = new int[2];
            for (i = 0; i < size; i++) {
                if (count[arr[i]] == 1)
                    temp[zero++] = arr[i];
                else
                    count[arr[i]]++;
            }  

            Arrays.sort(temp);
            System.out.println(temp[0]+" "+temp[1]);

        }
        
	}
}