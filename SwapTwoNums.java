package Basics;

public class SwapTwoNums {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c;
        System.out.println("value of a and b originally is: "+a+" & "+b);

        SwapTest.swap(a,b);
        //SwapTest.demo();


    }
}

    class SwapTest{
    public static void swap(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println("value of a and b after swapping is: "+a+" & "+b);
    }

    static void demo(){
        int a=16,b=45;
        swap(a,b);
    }
}
