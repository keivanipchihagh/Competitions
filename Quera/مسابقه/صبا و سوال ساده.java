import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        float number = Scan.nextInt();
        int count = Scan.nextInt();

        for (int  i = 0 ; i < count ; i++)
            number /= 2;

        System.out.println((int)Math.floor(number));
    }
}