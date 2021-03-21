import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        String phrase = Scan.nextLine();

        for (int i = 0 ; i < phrase.length() ; i++) {
            for (int j = 0 ; j < i ; j++)
                System.out.print(phrase.charAt(i));
            System.out.println(phrase.substring(i));
        }
    }
}