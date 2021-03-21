import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quera {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String args[]) {

        int number = Scan.nextInt();
        // Sorted List
        List<Integer> numberDigits = splitToDigits(number);

        boolean matched = false;

        for (int i = number + 1; i <= 1000000; i++)
            if (numberDigits.equals(splitToDigits(i))) {
                matched = true;
                System.out.println(i);
                break;
            }
        if (!matched)            
            System.out.println(0);
    }

    public static List<Integer> splitToDigits(int number) {

        List<Integer> digits = new ArrayList<>();
        while (number != 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.sort(digits);
        return digits;
    }
}