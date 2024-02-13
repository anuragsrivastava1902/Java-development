package Basics;

public class Palindrome {
    public static void main(String[] args) {
        int no=4543;
        PalindTest pt = new PalindTest();
        pt.test(no);
    }
}

class PalindTest{
    int a,newno;
    int number;
    public void test(int no){
       number =  no;
       while(no>0){
           a=no%10;
           newno=(newno*10)+a;
           no=no/10;
       }
       if(number==newno){
           System.out.println("its a palindrome");
       } else{
           System.out.println("it's not a palindrome");
       }
    }

}
