package Basics;

public class EvenOdd {
    public static void main(String[] args) {
        int range =6;
     EvenOddTest.test(range);
    }
}

class EvenOddTest{
    static int esum=0,osum=0;
    static void test(int n){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                esum+=i;
            }else{
                osum+=i;
            }
        }
        System.out.println("sum of even no's between 0 & "+n+" is "+esum);
        System.out.println("sum of odd no's between 0 & "+n+" is "+osum);
    }
}
