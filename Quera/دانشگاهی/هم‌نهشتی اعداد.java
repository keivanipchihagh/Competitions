import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOne = Scan.nextInt();
        int numberTwo = Scan.nextInt();

        if (numberTwo > numberOne) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }

        showDividers(numberOne, numberTwo);
    }

    public static void showDividers (int numberOne, int numberTwo) {
        int temp = numberOne - numberTwo;
        for (int i = 2 ; i <= temp; i++) {
            if (temp % i == 0)
                System.out.print(i + " ");
        }
    }
}