package javaTutorials;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int age;
		age = 18;
		
		switch (age) {
		case 1: 
			System.out.println("Can you even talk?");
			break;
		
		case 18:
			System.out.println("You should be graduating high school");
			break;
		
		default:
			System.out.println("Not a valid age");
			break;

		}
	}
}
