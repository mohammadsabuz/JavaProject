package javaTutorials;

import java.util.Scanner;

public class BuildCalculator {

	public static void main(String[] args) {

		Scanner calc = new Scanner (System.in);
		
		double fnum, snum, total;
		
		System.out.print("Enter first number: ");
		fnum = calc.nextDouble();
		
		System.out.print("Enter second number: ");
		snum = calc.nextDouble();
		
		total = fnum + snum;
		
		System.out.println("Total is: " + total);
		
	}

}
