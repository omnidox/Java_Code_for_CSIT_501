package module_6_HW;

public class Person {

	private int gender; // 1 will equal female, 0 will equal male

	// -----------------------------------------------------------------
	// Randomly chooses gender.
	// -----------------------------------------------------------------
	public int randomGender() {
		gender = (int) (Math.random() * 2);
		return gender;
	}

	// -----------------------------------------------------------------
	// Gender value accessor.
	// -----------------------------------------------------------------
	public int getGender() {
		return gender;
	}

	// -----------------------------------------------------------------
	// Returns a string representation of the gender
	// -----------------------------------------------------------------
	public String toString() {
		String genderStatus;
		if (gender == 0) {
			genderStatus = "Male";
		} else {
			genderStatus = "Female";
		}

		return genderStatus;

	}
}
