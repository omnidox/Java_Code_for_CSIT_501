package module_8_HW;

import java.util.Scanner;

public class EvenRead {
	
// ints for printing numbers in sequence and for printing their occurrence
	
	static int[] num = new int[5];

	static int[] num2 = new int[100];

// method invoked to increasing array size if number of numbers inputed is larger than the array.
	private static void increaseSize() {
		int[] temp = new int[num.length * 2];
		for (int n = 0; n < num.length; n++)
			temp[n] = num[n];
		num = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;

		int count = 0;

		int lineCount = 0;

		Scanner scan = new Scanner(System.in);

// do while is used to call for user input while input is even
		

		do {

			System.out.print("Enter an even integer between 2 and 100 inclusive, or enter an odd number to exit ");
			System.out.println();
			value = scan.nextInt();

			// this adds only even numbers between 2 and 100 inclusively to array num
			//increases array size if count reaches array size.
			if ((value % 2) == 0 && value <= 100 && value >= 2) {
				if (count == num.length) {
					increaseSize();
				}

				num[count] = value;
				count++;

			}

		} while ((value % 2) == 0);

		System.out.println();
		System.out.println(
				"There are " + count + " number of even entries, their sequence on the order inputted is as follows");
		System.out.println();
		System.out.println();

		//prints out all inputed values in sequence
		for (int n : num) {

			if (n == 0)
				break;

			//uses num2 to record occurrence of each even number
			for (int val = 0; val < num2.length; val++) {
				if (n == (val + 1))
					num2[val]++;
			}

			lineCount++;

			System.out.print(n + "    ");

			if (((lineCount) % 5) == 0) {
				System.out.println();
				System.out.println();
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// prints out values on the left, occurrences on the right.
		System.out.println("\nValue\tOccurrences");

		for (int val = 0; val < num2.length; val++) {

			if (((val + 1) % 2 == 0) && num2[val] != 0) {
				System.out.println((val + 1) + "\t" + num2[val]);
			}

		}
	}

}
