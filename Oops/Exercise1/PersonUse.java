package exercise1;

public class PersonUse {

	public static void main(String[] args) {
		
		Person person1 = new Person("Kunal", 28);
		Person person2 = new Person("Vishal", 24);
		
		System.out.println("Person1's details are below:");
		System.out.println("	Name:	"+person1.getName());
		System.out.println("	Age:	"+person1.getAge());
		System.out.println();
		System.out.println("Person2's details are below:");
		System.out.println("	Name:	"+person2.getName());
		System.out.println("	Age:	"+person2.getAge());

	}

}
