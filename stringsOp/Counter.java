package stringsOp;

public class Counter {

	public static void main(String[] args) {
		String str = "My name isAnurag ivastava";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
