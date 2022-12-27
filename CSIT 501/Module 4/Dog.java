package draft;

public class Dog {
	
	private int dogYears;
	
	private int humanYears;
	
	private String dogName;
	
	public Dog (String newName, int age ) 
	{
		dogName = newName;
		dogYears = age;	
	}
	
	public void setDogAge(int value)
	 {
	 dogYears = value;
	 }
	 
	 public int getDogAge()
	 {
	 return dogYears;
	 }
	 
	 public int getHumanAge()
	 {
		 humanYears = dogYears * 7;
		 return humanYears;
	 }
	 
	 public String toString()
	 {
		 return "Dog's Name:  " + dogName + "\t" + "Dog's Age  " + dogYears + "\t" + "Dog age in person years:  " + humanYears;
	 }
	

}
