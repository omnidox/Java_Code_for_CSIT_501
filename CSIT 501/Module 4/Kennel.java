package draft;

public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Jake", 5);
		Dog dog2 = new Dog("Zeus", 7);
		Dog dog3 = new Dog("Marmelade", 3);
		
		dog1.getHumanAge();
		
		dog2.getHumanAge();
		
		dog3.getHumanAge();
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);

	}

}
