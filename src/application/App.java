package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		/* This violates encapsulation.
		 * The instance variable is being accessed outside
		 * of its class.  Not good practice.
		 */
		person1.name = "Joe";
		
		System.out.println(person1.name);
		person1.sayHello();
		
	}

}
