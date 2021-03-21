import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int length = Scan.nextInt();
        Scan.nextLine();
        String sample = Scan.nextLine();
        String input = Scan.nextLine();

        int count = 0;
        for (int i = 0 ; i < length ; i++)
            if (sample.charAt(i) != input.charAt(i))
                count++;
        System.out.println(count);
    }
}