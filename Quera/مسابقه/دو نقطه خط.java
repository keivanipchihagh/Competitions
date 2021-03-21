import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int x1 = Scan.nextInt();
        int y1 = Scan.nextInt();
        int x2 = Scan.nextInt();
        int y2 = Scan.nextInt();

        if (y1 == y2)
            System.out.println("Horizontal");
        else if (x1 == x2)
            System.out.println("Vertical");
        else
            System.out.println("Try again");
    }
}