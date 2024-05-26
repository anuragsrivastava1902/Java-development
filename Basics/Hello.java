package Basics;

public class Hello {

	public static void main(String[] args) {
	System.out.println("hii");
	String name = "anurag";
	System.out.println(name);
	/*char s = name.charAt(3);
	System.out.println(s);
	*/
	
	for(int i=name.length()-1;i>=0;i--) {
		System.out.println(name.charAt(i));
	}
	}

}
