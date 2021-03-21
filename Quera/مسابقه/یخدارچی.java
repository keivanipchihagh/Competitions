import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int temp = Scan.nextInt();

        if (temp > 100)
            System.out.println("Steam");
        else if (temp < 0)
            System.out.println("Ice");
        else
            System.out.println("Water");
    }
}