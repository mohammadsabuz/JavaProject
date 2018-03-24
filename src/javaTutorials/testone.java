package javaTutorials;

import java.util.Scanner;

public class testone {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		testtwo tests = new testtwo();
		
		testtwo test = new testtwo();
		test.idontknow();
		
		System.out.println("Enter a word here: ");
		String word = scan.nextLine();
		test.iknow(word);
		
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		test.theyknow(number);
		
	}
	
}
