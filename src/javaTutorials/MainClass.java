package javaTutorials;

import java.util.Scanner;

// this is the main class method
public class MainClass {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		NotMainClass notMainClassObject = new NotMainClass();
		
		System.out.println("Enter your name: ");
		String name = userInput.nextLine();
		notMainClassObject.notMainMethod(name);
		
		notMainClassObject.NotMainMethod2();
	}

}
