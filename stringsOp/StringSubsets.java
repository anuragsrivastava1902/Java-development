package stringsOp;

import java.util.Arrays;

public class StringSubsets {
	public static void main(String[] args) {
		String str = "Sita";
		int len = str.length();
		int temp =0;
		
		String[] strArr = new String[(len*(len+1))/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				String substr = str.substring(i,j+1);
				strArr[temp] = substr;
				temp++;
			}
		}
		System.out.println((Arrays.toString(strArr))+" and the length is "+strArr.length);
	}
}
