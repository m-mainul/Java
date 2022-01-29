import java.util.Scanner;


public class MainClass {
	static Scanner inputReader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ChildClass childClassObject = new ChildClass();
		
		System.out.println("Enter your name here: ");
		String name = inputReader.nextLine();
		
		childClassObject.simpleMessage(name);
	}
	
	/*
	 * A function with call one or more values which is refered as parameters
	 */

	
}
