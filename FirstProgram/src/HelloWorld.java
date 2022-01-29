import java.util.Scanner;


public class HelloWorld {

	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("May I know your name please?\n");
		String name = inputReader.nextLine();
		
		System.out.println("Hello!!" + name);

	}

}
