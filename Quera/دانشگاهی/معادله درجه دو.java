import java.text.DecimalFormat;
import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();				
		
		DecimalFormat DF = new DecimalFormat("#0.000");
		
//		if ( a == 0 && b != 0 && c != 0) {
//			System.out.println(DF.format(-1 * c / b));
//		} else if (a != 0 && b == 0 && c != 0) {
//			double answerOne = -1 * Math.sqrt(-1 * c / a);
//			double answerTwo = +1 * Math.sqrt(-1 * c / a);
//			if (answerOne > answerTwo) {
//				System.out.println(DF.format(answerTwo));
//				System.out.println(DF.format(answerOne));
//			} else {
//				System.out.println(DF.format(answerOne));
//				System.out.println(DF.format(answerTwo));				
//			}
//		} else if (a != 0 && b!= 0 && c == 0) {
//			double answerOne = ((-1 * b) + b) / (2 * a);
//			double answerTwo = ((-1 * b) - b) / (2 * a);
//			if (answerOne > answerTwo) {
//				System.out.println(DF.format(answerTwo));
//				System.out.println(DF.format(answerOne));
//			} else {
//				System.out.println(DF.format(answerOne));
//				System.out.println(DF.format(answerTwo));				
//			}
//		} else if (a == 0 && b == 0 && c != 0) {
//			System.out.println("IMPOSSIBLE");
//		} else if ( a== 0 && b!= 0 && c == 0) {
//			System.out.println("0.000");
//		}
		
		
		
		
		
		if (a == 0 && b != 0 && c != 0) 
			System.out.println(DF.format((-1 * c) / b));
		else if (a != 0 && b == 0 && c != 0) {
			if ((a < 0 && c > 0) || (a > 0 && c < 0)) {
				double answerOne = -1 * Math.sqrt(a * -4 * c) / (2 * a);
				double answerTwo = +1 * Math.sqrt(a * -4 * c) / (2 * a);
				if (answerOne > answerTwo) {
					System.out.println(DF.format(answerTwo));
					System.out.println(DF.format(answerOne));				
				} else {				
					System.out.println(DF.format(answerOne));
					System.out.println(DF.format(answerTwo));
				}				
			} else {
				System.out.println("IMPOSSIBLE");
			}
		} else if (a == 0 && b == 0) {
			System.out.println("IMPOSSIBLE");
		} else if (a == 0 && c == 0) {
			System.out.println("0.000");
		} else if (b == 0 && c == 0) {
			System.out.println("0.000");
		} else if (a == 0 && b == 0 && c == 0) {
			System.out.println("0.000");
		} else {
			double delta = (b*b) - (4 * a * c);			
			
			if (delta > 0) {			
				double answerOne = ((-1 * b) + Math.sqrt(delta))/(2 * a);
				double answerTwo = ((-1 * b) - Math.sqrt(delta))/(2 * a);
				if (answerOne > answerTwo) {
					System.out.println(DF.format(answerTwo));
					System.out.println(DF.format(answerOne));				
				} else {				
					System.out.println(DF.format(answerOne));
					System.out.println(DF.format(answerTwo));
				}				
			} else if (delta == 0) {
				System.out.println(DF.format((-1 * b) / (2 * a)));
			} else {
				System.out.println("IMPOSSIBLE");
			}			
		}		
	}			
}