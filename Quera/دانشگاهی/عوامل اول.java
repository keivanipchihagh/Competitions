import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number = Scan.nextInt();
        List<Integer> primeDividors = dividorPrimeList(number);
        List<Integer> primeDividorsPower = new ArrayList<>();
        for (int i = 0; i < primeDividors.size(); i++) {
            int count = 0;
            int temp = number;
            while (temp % primeDividors.get(i) == 0) {
                count++;
                temp /= primeDividors.get(i);
            }
            primeDividorsPower.add(count);
        }

        String str = "";
        for (int i = 0; i < primeDividors.size(); i++) {
            if (i != primeDividors.size() - 1)
                str += primeDividors.get(i) + "^" + primeDividorsPower.get(i) + "*";
            else
                str += primeDividors.get(i) + "^" + primeDividorsPower.get(i);
        }
        System.out.println(str.replace("^1", ""));
    }

    public static List<Integer> dividorPrimeList(int number) {
        List<Integer> dividors = dividorList(number);
        List<Integer> primeDividors = new ArrayList<>();
        for (int i = 0 ; i < dividors.size(); i++)
            if (isPrime(dividors.get(i)))
                primeDividors.add(dividors.get(i));
        return primeDividors;
    }

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

    public static List<Integer> dividorList(int number) {
        List<Integer> dividors = new ArrayList<>();
        for (int i = 1; i * i <= number; i++)
            if (number % i == 0) {
                if (i != (number / i)) {
                    dividors.add(i);
                    dividors.add(number / i);
                }
                else
                    dividors.add(i);
            }
        return dividors;
    }
}