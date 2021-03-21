import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int p = scan.nextInt();
		int d = scan.nextInt();
		
		for (int i = d; true; i += d) {
			int temp = i % p;
			if (temp >= 0 && temp <= p / 2) {
				System.out.println(i);
				break;
			}
		}
	}
}