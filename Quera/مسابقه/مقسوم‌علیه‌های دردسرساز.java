import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = scan.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			int[] temp = new int[2];
			temp = calc(i);
			sum += temp[0];
			count += temp[1];			
		}
		System.out.println(count + " " + sum);		
	}
	
	public static int[] calc(int number) {
	
		int count = 0;
		int sum = 0;
		
		for (int i = 1 ; i * i < number; i++)
			if (number % i == 0) {
				sum += i;
				sum += (number / i);
				count += 2;
			}
		double sqrt = Math.sqrt(number);
		if (number == (int)sqrt * (int)sqrt) {
			count++;
			sum += sqrt;
		}

		
		return new int[] {sum, count};
	}
}