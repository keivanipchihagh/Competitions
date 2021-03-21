import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int x1 = Scan.nextInt();
        int y1 = Scan.nextInt();
        Scan.nextLine();
        int x2 = Scan.nextInt();
        int y2 = Scan.nextInt();

        if (x2 > x1)
            System.out.println("Right");
        else
            System.out.println("Left");
    }
}