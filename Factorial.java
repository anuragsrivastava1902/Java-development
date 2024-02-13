package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. of range 0-10");
        int number =sc.nextInt();
        long fact= calc(number);
        System.out.println("factorial of "+number+" is "+fact);
    }
   /* This is the recursive approach for this same problem -- (commented out for later understanding)

   public static long calc(int n){
        if(n==0){
            return 1;
        }else{
            return n*calc(n-1);
        }
    }*/

    public static long calc(int n){
        long no=1;
        for(int i=1;i<=n;i++){
            no=no*i;
        }
        return  no;
    }

}


