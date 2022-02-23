package empWage;

import java.util.Random; // import Random class

public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		int r = random.nextInt(2);
		if (r == 1)
			//Employee Present or Absent
			System.out.println("Employee Present");
		else
			System.out.println("Employee Absent");

	}
}
