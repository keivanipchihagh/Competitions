import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	public static List<Long> fibonacciNumbers = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int number = scan.nextInt();		
		createFibonacci();
		
		for (int i = 1 ; i <= number ; i++) {
			if (fibonacciNumbers.contains((long)i))
				System.out.print("+");
			else
				System.out.print("-");
		}			
	}
	
	public static void createFibonacci() {		
		int num1 = 1;
		int num2 = 1;		
		
		fibonacciNumbers.add((long)1);		
		
		while (fibonacciNumbers.size() <= 30) {			
			int num3 = num1 + num2;
			
			fibonacciNumbers.add((long)num3);
			
			// Swap to fit algorithm
			num1 = num2;
			num2 = num3;			
		}			
	}
}
