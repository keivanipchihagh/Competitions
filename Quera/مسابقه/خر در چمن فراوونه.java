import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int l = scan.nextInt();
		
		int step = 1;
		int total = 0;
		while (step <= l) {
			if (step % 2 == 1)
				total += a;
			else
				total += b;
			//System.out.println(total);
			step++;
		}
		System.out.println(total);
	}
}