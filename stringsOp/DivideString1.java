package stringsOp;

import java.util.Arrays;

public class DivideString1 {
	public static void main(String[] args) {
		String str = "HelloHello";
		int temp=0;
		int parts = 2;
		int len = str.length();
		int chars = len / parts;
		String[] str1 = new String[parts];
		if(len%parts!=0) {
			System.out.println("not possible");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String substr = str.substring(i,i+chars);
				str1[temp]=substr;
				temp++;
			}
			System.out.println(Arrays.toString(str1));
		}
		
	}
}
