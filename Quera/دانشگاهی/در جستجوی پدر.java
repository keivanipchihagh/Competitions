import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int count = Scan.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++)
            numbers.add(Scan.nextInt());

        for (int i = 0; i < count; i++) {
            boolean father = false;
            for (int j = 0; j < numbers.get(i); j++)
                if (j + sumOfDigits(j) + sumOfPrimeDividorList(j) == numbers.get(i)) {
                    father = true;
                    break;
                }

            if (father == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }

    /// Returns a boolean indicating whether the input is prime or not
    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;
        else if (number == 2)
            return true;
        else if (number % 2 == 0)
            return false;
        for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0)
                return false;

        return true;
    }

    /// Returns the dividor list of the input
    public static List<Integer> dividorList(int number) {

        List<Integer> dividors = new ArrayList<>();
        for (int i = 1; i * i <= number; i++)
            if (number % i == 0) {
                if (i != (number / i)) {
                    dividors.add(i);
                    dividors.add(number / i);
                } else
                    dividors.add(i);
            }

        return dividors;
    }

    /// Returns the sum of digits of an Integer
    public static int sumOfDigits(int number) {

        int sum = 0;
        while (number != 0) 
        { 
            sum += (number % 10);
            number /= 10; 
        } 
        return sum;
    }

    /// Returns the prime dividor list of the input
    public static int sumOfPrimeDividorList(int number) {

        List<Integer> dividors = dividorList(number);
        int sum = 0;

        for (int i = 0; i < dividors.size(); i++)
            if (isPrime(dividors.get(i)))
                sum += dividors.get(i);

        return sum;
    }
}