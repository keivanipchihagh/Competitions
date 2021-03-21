import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        String str = Scan.nextLine().toLowerCase().replace(" ", "");
        List<Character> digits = new ArrayList<>();

        for (int i = 0 ; i < str.length() ; i++)
            if (str.charAt(i) != '.' && str.charAt(i) != ',' && str.charAt(i) != '?' && str.charAt(i) != '!' && str.charAt(i) != ';' && str.charAt(i) != ':')
            digits.add(str.charAt(i));

        List<Character> reverseDigits = new ArrayList<>();
        for (int i = digits.size() - 1 ; i >= 0  ; i--)
            reverseDigits.add(digits.get(i));

        boolean equal = true;
        for (int i = 0 ; i < reverseDigits.size() ; i++)
            if (digits.get(i) != reverseDigits.get(i)) {
                equal = false;
                break;
            }

        if (equal)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}