import java.util.Arrays;
import java.util.Scanner;

class Main {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int number = scan.nextInt();

        if (number % 2 == 1)
            System.out.println("Impossible");
        else {
            boolean mathced = false;
            for (int i = 1; i < number; i++) {
                for (int j = 1; j < number - i; j++) {
                    int k = number - i - j;
                    if (i + j + k == number)
                        if (canFormTriangle(i, j, k)) {
                            sortAndShow(i, j, k);
                            mathced = true;
                            break;
                        }
                    if (mathced)
                        break;
                }
                if (mathced)
                    break;
            }
            if (!mathced)
                System.out.println("Impossible");
        }
    }

    public static void sortAndShow(int i, int j, int k) {
        int[] arr = new int[] { i, j, k };
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }

    public static boolean canFormTriangle(int i, int j, int k) {
        if ((i * i) + (j * j) == (k * k) || (k * k) + (i * i) == (j * j) || (k * k) + (j * j) == (i * i))
            return true;
        else
            return false;
    }
}