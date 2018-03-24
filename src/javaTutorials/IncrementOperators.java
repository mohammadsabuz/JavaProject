package javaTutorials;

public class IncrementOperators {

	public static void main(String[] args) {
	
		int abc = 5;
		
		// regular int
		System.out.println("Regular int: " + abc);
		
		// add to int before executing
		++abc;
		System.out.println("Added before executing: " + abc);
		
		// add to int after executing
		abc++;
		System.out.println("Added after executing: " + abc);
		
		// subtract to int before executing
		--abc;
		System.out.println("Subtracted before executing: " + abc);
		
		// subtract to int after executing
		abc--;
		System.out.println("Subtracted after executing: " + abc);
		
		// add to int and then add another number
		abc += 10; // abc = abc + 10
		System.out.println("Add to int and then add the new value: " + abc);
		
		// subtract from int and then add another number
		abc -= 10; // abc = -abc + 10
		System.out.println("Subtract from int and then add the new value: " + abc);
		
		// multiply to int and then add another number
		abc *= 10; // abc = abc * 10
		System.out.println("Multiply to int: " + abc);
		
	}
}
