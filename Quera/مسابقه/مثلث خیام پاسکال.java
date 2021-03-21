import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int number = scan.nextInt();
		
		if (number == 1) {
			System.out.println("1");
		} else if (number == 2) {
			System.out.println("1 1");
		} else {
		
		System.out.println("1");
		System.out.println("1 1");
		
		List<Integer> Prenumbers = new ArrayList<Integer>();
		Prenumbers.add(1);
		Prenumbers.add(1);
		
		for (int i = 2 ; i < number ; i++) {			
			
			List<Integer> Currentnumbers = new ArrayList<Integer>();
			Currentnumbers.add(1);
			
			for (int k = 0 ; k < Prenumbers.size() - 1 ; k++)
				Currentnumbers.add(Prenumbers.get(k) + Prenumbers.get(k + 1));
			
			Currentnumbers.add(1);
			
			for (int j = 0 ; j < Currentnumbers.size() ; j++)
				System.out.print(Currentnumbers.get(j) + " ");
			
			// Replace Lists
			Prenumbers = Currentnumbers;
			// Go Next Line
			System.out.println();
		}
		
		}
	}
}
