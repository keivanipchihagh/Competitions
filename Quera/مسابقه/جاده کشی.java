import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int input = Scan.nextInt();
        int output;
        if (input % 2 == 0) {
            // Even
            output = ((input / 2) + 1) * ((input / 2) + 1);
        } else {
            // Odd
            output = (((input - 1) / 2) + 1) * (((input - 1) / 2) + 2);
        }
        System.out.println(output);
    }
}