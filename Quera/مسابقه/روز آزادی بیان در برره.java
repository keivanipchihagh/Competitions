import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int k = scan.nextInt();
		
		if (k % 2 == 0)
			System.out.println("Bala Barare");
		else
			System.out.println("Payin Barare");		
	}
}