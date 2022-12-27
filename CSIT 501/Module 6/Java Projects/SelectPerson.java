package module_6_HW;

public class SelectPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int malecount = 0;

		int femalecount = 0;

		Person person1 = new Person();

		for (int i = 0; i < 25; i++) {
			if (person1.randomGender() == 0) {
				malecount++;
			} else {
				femalecount++;
			}

		}

		System.out.println("Female was selected: " + femalecount + " times");

		System.out.println();

		System.out.println("Male was selected: " + malecount + " times");

	}

}
