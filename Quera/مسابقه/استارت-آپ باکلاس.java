import java.util.Scanner;

public class Excersise {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] items = new int[4];
		int[] people = new int[4];
		for (int i = 0; i < 4; i++)
			people[i] = 0;
			
		for (int i = 0; i < 4; i++)
			items[i] = scan.nextInt();
		
		int step = 1;
		while (items[0] != 0 && items[1] != 0 && items[2] != 0 && items[3] != 0 ) {
			
			items[step - 1]--;
			people[step - 1]++;
			items = rotateCounterClockWise(items);
			
			step++;
			if (step == 5)
				step = 1;
		}		
		for (int i = 0; i < 4; i++)
			System.out.print(people[i] + " ");
	}
	
	public static int[] rotateCounterClockWise(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = array[2];
		array[2] = array[3];
		array[3] = temp;
		return array;
	}
}