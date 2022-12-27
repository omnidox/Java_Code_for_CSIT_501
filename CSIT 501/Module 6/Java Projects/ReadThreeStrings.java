package module_6_HW;

import java.util.Scanner;

public class ReadThreeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value1;
		String value2;
		String value3;

		int ecount = 0;
		int tcount = 0;
		int ncount = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		value1 = scan.nextLine();
		System.out.println();

		System.out.print("Enter the second string: ");
		value2 = scan.nextLine();
		System.out.println();

		System.out.print("Enter the third string: ");
		value3 = scan.nextLine();
		System.out.println();

		for (int i = 0; i < value1.length(); i++) {
			if (value1.charAt(i) == 'e') {
				ecount++;
			}
		}

		for (int j = 0; j < value2.length(); j++) {
			if (value2.charAt(j) == 't') {
				tcount++;
			}
		}

		for (int k = 0; k < value3.length(); k++) {
			if (value3.charAt(k) == 'n') {
				ncount++;
			}
		}

		System.out.println("the letter e appeared " + ecount + " times within the first string.");
		System.out.println();

		System.out.println("the letter t appeared " + tcount + " times within the second string.");
		System.out.println();

		System.out.println("the letter n appeared " + ncount + " times within the third string.");
		System.out.println();

	}

}
