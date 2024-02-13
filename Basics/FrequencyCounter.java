package Basics;

import java.util.Scanner;

public class FrequencyCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence here, below");
		String word = sc.nextLine();
		char[] charArray1 = word.toCharArray();
		System.out.println("enter the word you want to count in your senetnce");
		String wordToSearch = sc.nextLine();
		char wts = wordToSearch.charAt(0);
		int count =0;
		
		for(int i=0; i<charArray1.length;i++) {
			if(charArray1[i] == wts) {
				count++;
			}
		}
		
System.out.println("the total no. of occurence of "+wts+" is : "+count);
	}

}
