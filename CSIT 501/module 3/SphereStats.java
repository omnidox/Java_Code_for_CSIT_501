import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int radius;
		 double volume, surface_area;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the sphere's radius: ");
		 radius = scan.nextInt();
		 volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		 surface_area = 4 * Math.PI * Math.pow(radius, 2);
		 // Round the output to four decimal places
		 DecimalFormat fmt = new DecimalFormat("0.####");
		 System.out.println("The sphere's Volume: " + fmt.format(volume));
		 System.out.println("The sphere's surface area: "
		 + fmt.format(surface_area));

	}

}
