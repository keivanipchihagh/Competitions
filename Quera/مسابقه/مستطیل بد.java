import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	public static Set<String> triangles = new HashSet<String>();
	
	public static void main(String[] args) {

		int number = scan.nextInt();
				
		if (number % 2 == 0 ) {								
			System.out.println(Math.round(((double)number * (double)number ) / 48.0));
		} else {
			System.out.println(Math.round(Math.pow((double)number + 3.0, 2) / 48.0));
		}
	}	
}