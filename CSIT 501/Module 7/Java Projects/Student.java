package module_7_HW;

//********************************************************************
//Student.java Author: Lewis/Loftus
//
//Represents a college student.
//********************************************************************
public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int test1, test2, test3, average;

//-----------------------------------------------------------------
// Constructor: Sets up this student with the specified values. 
// Test scores are assumed to be 0 is no tests are inputed
//-----------------------------------------------------------------
	public Student(String first, String last, Address home, Address school) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}

	// -----------------------------------------------------------------
	// Constructor: Sets up this student with the specified values. Test scores are
	// provided.
	// -----------------------------------------------------------------
	public Student(String first, String last, Address home, Address school, int t1, int t2, int t3) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}

	// -----------------------------------------------------------------
	// sets the test score by receiving the test number and the score for that test
	// number
	// -----------------------------------------------------------------
	public void setTestScore(int tstNum, int score) {
		switch (tstNum) {
		case 1:
			test1 = score;
			break;
		case 2:
			test2 = score;
			break;
		case 3:
			test3 = score;
			break;
		}
	}

	// -----------------------------------------------------------------
	// Gets the test score by receiving the test number and returns the score of the
	// test.
	// -----------------------------------------------------------------
	public int getTestScore(int tstNum) {
		switch (tstNum) {
		case 1:
			return test1;
		case 2:
			return test2;
		case 3:
			return test3;
		default:
			return 0;
		}

	}

	// -----------------------------------------------------------------
	// Returns the average of all tests
	// -----------------------------------------------------------------
	public int average() {
		average = (test1 + test2 + test3) / 3;

		return average;

	}

//-----------------------------------------------------------------
// Returns a string description of this Student object.
//-----------------------------------------------------------------
	public String toString() {
		String result;
		result = firstName + " " + lastName + "\n";
		result += "First test score is " + getTestScore(1) + "\n";
		result += "Second test score is " + getTestScore(2) + "\n";
		result += "Third test score is " + getTestScore(3) + "\n";
		result += "The average of all of the test scores rounded down is " + average() + "\n" + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress;
		return result;
	}
}