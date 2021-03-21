
import java.util.Scanner;

public class Game {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        if (sum >= k)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
