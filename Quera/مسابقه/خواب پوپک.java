import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int a = Scan.nextInt();
        int b = Scan.nextInt();
        int x = Scan.nextInt();

        List<Integer> a_dividors = dividorList(a);
        List<Integer> b_dividors = dividorList(b);

        int count = 0;
        for (int i = 0 ; i < a_dividors.size() ; i++)
            for (int j = 0 ; j < b_dividors.size() ; j++)
                if (a_dividors.get(i) + b_dividors.get(j) <= x)
                    count++;

        System.out.println(count);
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