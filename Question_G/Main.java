 

import java.util.Scanner;



class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long mul3 = N/3;
        long mul5 = N/5;
        long mul15 = N/15;

        long value = mul3+mul5-mul15;
        System.out.println(value);



    }

}