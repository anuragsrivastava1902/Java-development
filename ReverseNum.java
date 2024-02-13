package Basics;

public class ReverseNum {
    public static void main(String[] args) {
        int rev=0, r=0, no=99993;
        RevTest rt = new RevTest();
        rt.reverse(rev,r,no);

    }
}

class RevTest{
    public void reverse(){

    }

    public void reverse(int rev, int r, int no) {
        int number = no;
        while(no>0){
            r = no % 10;
            rev = (rev *10) + r;
            no = no/10;
        }
        if(number%10==0){
            System.out.println("a leading zero is mising");
        }
        System.out.println("the reversed number is: "+rev);
    }
}
