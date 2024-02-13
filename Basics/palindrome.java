package Basics;

import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string of your choice to check for valid pallindrome");
		String word = sc.nextLine();
		
		boolean test = true;
		int len = word.length();
		char[] charArray = word.toCharArray();
		
		for(int i=0; i<len; i++) {
			if(charArray[i] != charArray[len-1-i]) {
				System.out.println("not a valid pallindrome");
				test = false;
				break;
			} //if
			} // for
		if(test) {
			System.out.println("valid pallindrome");
		}
		} // main
		

	}


