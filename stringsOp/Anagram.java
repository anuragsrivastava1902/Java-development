package stringsOp;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="heillo", str2="ollhie";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("not anagram! rejected");
		}
		else {
			char[] char1 =str1.toCharArray();
			char[] char2 =str2.toCharArray();
		
			Arrays.sort(char1);
			Arrays.sort(char2);
		
			if(Arrays.equals(char1, char2) == true) {
			System.out.println("Anagram");
			}
			else {
			System.out.println("Not anagram");
			}
		}
	}
}