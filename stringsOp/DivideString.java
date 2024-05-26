package stringsOp;

import java.util.Arrays;

public class DivideString {
	public static void main(String[] args) {
		String str ="AnuragAnuragAnurag";
		int len =str.length();
		int temp=0, n=3;
		int chars =len/n;
		String[] strArr = new String[n];
		if(len%n!=0) {
			System.out.println("Exit! div not possible");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String substr = str.substring(i, i+chars);
				strArr[temp] = substr;
				temp++;
			}
			System.out.println(Arrays.toString(strArr));
		}
		
	}
}
