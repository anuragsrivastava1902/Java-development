package basics.strings;

public class StringProgram {

	public static void main(String[] args) {
		char[] ch= {'a','n','u','r','a','g'};
		String s = new String(ch); 
		/*
		 * System.out.println(s); String s2= "anurag"; String s3 = "anurag";
		 * System.out.println(s2==s3);
		 */
		
		
		/*
		 * String name = new String("Shivam"); System.out.println(name); String name2=
		 * new String("Shivam"); System.out.println(name2);
		 * 
		 * System.out.println(name==name2);
		 */
		
		//finding character at specific position
		char firstCharacter = s.charAt(0);
		System.out.println(firstCharacter);
		
		//Length of the string
		System.out.println(s.length());
		
		//Substring of the given string
		try {
		System.out.println(s.substring(2,6));
		}catch(Exception e) {
			System.err.println("out of bounds exception");
		}
		
		@SuppressWarnings("unused")
		int i = 0;
		
		//equals method on string
		boolean isTrue = s.equals("anurag");
		System.out.println(isTrue);
		
		//contains method on string
		System.out.println(s.contains("anu"));
		
		//concat method on string
		String fullname = s.concat(" Srivastava                  ");
		System.out.println(fullname);
		
		//checking isEmpty method on string
		System.out.println(s.isEmpty());
		
		//replacing the contents of string
		System.out.println(s.replace('a','A'));
		
		//equalsIgnoreCase method
		System.out.println(s.equalsIgnoreCase("anurag"));
		
		//trim method
		System.out.println(fullname+" is me");
		System.out.println(fullname.trim() + " is me");	
	}

}
