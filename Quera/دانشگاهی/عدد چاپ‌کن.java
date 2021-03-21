import java.util.Scanner;

class Main {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String str = scan.nextLine();
        
        for (int i = 0; i < str.length(); i++)
	{
		int Temp = str.charAt(i) - '0';
        System.out.print(Temp + ": ");
		for (int j = 0; j < Temp; j++)
			System.out.print(Temp);
		System.out.println();
	}
    }    
}