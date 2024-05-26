package basics.strings;

public class StringBuilderClassMethods {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("anurag");
		name.append(" Srivastava");
		String fullname = name.replace(0, 1, "A").toString();
		System.out.println(fullname);
		
		String city = "ayodhya";
		city.concat(" dham");
		System.out.println(city);
		
		
		// join is a static method of String class
		String message = String.join(" is from ", fullname, city);
		System.out.println(message);
		
		
		
		
		
	}

}
