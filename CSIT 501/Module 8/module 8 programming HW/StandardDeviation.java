package module_8_HW;

import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0, calc1 = 0, avg = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the amount of integers you want to input: ");

		int n = scan.nextInt();

		double nums[] = new double[n];

		// calculates average
		for (int i = 0; i < n; ++i) {
			
			System.out.println("Please input int number " + (i + 1) + ": ");

			nums[i] = scan.nextDouble();

			sum = sum + nums[i];

		}

		avg = sum / n;

		System.out.println("Average number of the inputted values is: " + (sum / n));

		//calculates the summation portion of the equation
		for (int i = 0; i < n; ++i) {

			calc1 += ((nums[i] - avg) * (nums[i] - avg));

		}
		// finds the square root of the summation
		
		//note i believe the standard deviation equation in the book to be incorrect
		//calc1 at this point should be divided by the size of the array
		// See https://byjus.com/standard-deviation-formula/ for details
		calc1 = Math.sqrt(calc1);

		System.out.println("Standard Deviation is: " + calc1);

	}

}
