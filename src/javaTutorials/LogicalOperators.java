package javaTutorials;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int classGrade, testGrade;
		
		classGrade = 91;
		testGrade = 90;
		
		// && is comparing two variable (both has to be true).   || is also for comparing two variable (only one has to be true)
		if (classGrade >= 90 && testGrade >= 90) {
			System.out.println("WOW!!! You are a smart.");
		}else {
			System.out.println("You need to study more.");
		}
	}
}
