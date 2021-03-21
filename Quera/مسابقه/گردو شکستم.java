import java.util.Scanner;

public class Quera {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String args[]) {

        int distance = Scan.nextInt();
        int x = Scan.nextInt();
        int y = Scan.nextInt();

        boolean matched = false;
        for (int i = 0; i <= distance * 0.2; i++) {
            for (int j = 0; j <= distance * 0.2; j++)
                if ((i * x) + (j * y) == distance) {
                    System.out.println(i + " " + j);
                    matched = true;
                    break;
                }
            if (matched)
                break;
        }

        if (distance == 1) {
            if (x == 1 && y != 1)
                System.out.println("1 0");
            else if (x != 1 && y == 1)
                System.out.println("0 1");
            else if (x == 1 && y == 1)
                System.out.println("1 0");
            else
                System.out.println("-1");
        }
        else if (!matched)
            System.out.println("-1");
    }
}