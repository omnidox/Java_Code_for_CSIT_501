import java.util.Scanner;

import java.util.*;

public class FloatCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 float f1;
		 float f2;
		 float f3;
		 Scanner scan = new Scanner(System.in);
		 
		 
		 System.out.print("Enter the first float: ");
		 f1 = scan.nextFloat();
		 
		 System.out.print("Enter the second float: ");
		 f2 = scan.nextFloat();
		 
		 System.out.print("Enter the third float: ");
		 f3 = scan.nextFloat();
		 
		 
		 
		 float faverage = (f1+f2+f3) / 3;
		 
		 System.out.println("Float average: " + faverage);
		 
		 // possible equation float fcubed = (float) Math.pow(faverage, 3);
		 
		 float fcubed = faverage*faverage*faverage;
		 
		 System.out.println("Float average cubed: " + fcubed);

	}

}
