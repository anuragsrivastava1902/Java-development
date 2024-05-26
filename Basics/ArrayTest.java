package Basics;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] school = {0,1,43,823,32982,474,2,3,4,5,6};
		Arrays.sort(school);
		System.out.println(Arrays.toString(school));
		
		String[] names = {"ram","shyam","dhanush","hanuman","sita","ravana"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		//System.out.println(Arrays.binarySearch(school, "dhanush")); // Invalid
		
		int[] highschool = new int[20];
		for(int k=0;k<highschool.length;k++) {
			highschool[k]=(int) (Math.random()*80);
		}
		Arrays.sort(highschool);
		System.out.println(Arrays.toString(highschool));
		System.out.println(Arrays.binarySearch(highschool,67));

	}

}
