package stringsOp;

public class VowelConsonant {

	public static void main(String[] args) {
		String str = "anu$rag";
		int vc=0, cc=0;
		
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)== 'a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u')){
				vc++;
			}
			else if((str.charAt(i)<'z') && (str.charAt(i)>'a')) {
				cc++;
			}
		}
		System.out.println(vc+" vowels & "+cc+" consonants");
	
	}
}