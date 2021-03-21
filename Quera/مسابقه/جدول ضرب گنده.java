import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();

        for (int i = 1 ; i <= number ; i++) {
            for (int j = 1; j <= number; j++)
                System.out.print((i * j) + " ");
            System.out.print("\n");
        }
    }
}