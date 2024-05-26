package Basics;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "anurag Srivastava", str2= "arjun kapoor";
		String str3 = "ANURAG SRIVASTAVA";
		String str4 = "    Hello India       ";
		
		// charAt method
		System.out.println(str1.charAt(0));
		
		//indexOf method
		System.out.println(str1.indexOf("vhdea"));
		
		//lastIndexOf
		System.out.println(str1.lastIndexOf("a"));
		
		//toUppercase
		String strupp = str1.toUpperCase();
		System.out.println(strupp);
		String strlow = strupp.toLowerCase();
		System.out.println(strlow);
		
		//toCharArray
		char[] charray =str1.toCharArray();
		for(int i=0;i<charray.length;i++) {
		System.out.print(charray[i]+" ");
		}
		
		//length() method
		int len =str1.length();
		System.out.println("\nlength of this is "+len);
		
		//compareTo
		int compa = str2.compareTo(str2);
		System.out.println(compa);
		
		//compareToIgnoreCse
		System.out.println(str1.compareToIgnoreCase(str3));
		
		//concat strings
		String conc = str1.concat(" "+str3);
		System.out.println(conc);
		
		// trim method
		System.out.println(str4);
		System.out.println(str4.trim());
		
		//codePointAt
		int num = str1.codePointAt(0);
		System.out.println(num);
		
		//replace method
		String strrplc = str1.replaceAll("an", "l");
		System.out.println(strrplc);
		System.out.println(str2.replaceFirst("a","j"));
		
		//getChars method
		char[] chray1 = new char[10];
		str1.getChars(6, 10, chray1, 4);
		System.out.println(Arrays.toString(chray1));
		
		//
		String[] names = new String[10];
		for(int a=0;a<names.length;a++) {
			if(a>5) {
			names[a]="ha";
			}
		}
		System.out.println(Arrays.toString(names));
	}

}
