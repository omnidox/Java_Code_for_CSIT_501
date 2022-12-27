package module_7_HW;

//********************************************************************
//StudentBody.java Author: Lewis/Loftus
//
//Demonstrates the use of an aggregate class.
//********************************************************************
public class StudentBody {
//-----------------------------------------------------------------
// Creates some Address and Student objects and prints them.
//-----------------------------------------------------------------
	public static void main(String[] args) {
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);

		// updated John's info so that it includes his three tests scores.

		Student john = new Student("John", "Smith", jHome, school, 89, 75, 95);
		Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school);
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);

		// set new test scores for Marsha

		marsha.setTestScore(1, 78);

		marsha.setTestScore(2, 98);

		marsha.setTestScore(3, 90);

		System.out.println();
		System.out.println(marsha);
	}
}
