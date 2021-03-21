import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int count = Scan.nextInt();
        Scan.nextLine();

        String[] words = new String[count];
        for (int i = 0 ; i < count ; i++)
            words[i] = Scan.next();

        for (int i = count - 1 ; i >= 0 ; i--)
            System.out.print(words[i] + " ");
    }
}