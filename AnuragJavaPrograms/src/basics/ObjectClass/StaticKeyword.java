package basics.ObjectClass;

public class StaticKeyword {

	public static void main(String[] args) {
		Person p1= new Person("anurag",30);
		Person p2= new Person("Vinod",59);
		p1.displayDetails();
		p2.displayDetails();
	}

}

class Person{
	
	public Person(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	String name;
	int age;
	static String religion="indian";
	static int count=0;
	
	void displayDetails() {
		
		if(count>0) {
		System.out.println("name is "+name+", age is "+age+ " and religion is \"proud "+religion+"\" !!");
		} else {
			System.out.println("name is "+name+", age is "+age+ " and religion is "+religion+" !!");
		}
		count++;
		//System.out.println(count);
	}
}
