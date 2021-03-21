import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {            

        String[] string = Scan.nextLine().split(" ");        
        List<Character> verified = convertStringToCharList(string[1]);  
        String[] samples = new String[Integer.valueOf(string[0])];

        for (int i = 0; i < Integer.valueOf(string[0]); i++)
        samples[i] = Scan.nextLine();

        for (int i = 0; i < Integer.valueOf(string[0]); i++) {
            List<Character> temp = convertStringToCharList(samples[i]);
            if (varifiedOrNot(samples[i], verified) && varifiedOrNot(string[1], temp))
                System.out.println("Yes");
            else
                System.out.println("No");
        }        
    }

    public static boolean varifiedOrNot(String sample, List<Character> verified) {        
        for (int j = 0 ; j < sample.length(); j++)
            if (!verified.contains(sample.charAt(j)))
                return false;
        return true;
    }

    public static List<Character> convertStringToCharList(String str) {   
        List<Character> chars = new ArrayList<>();   
        for (char ch : str.toCharArray())
            chars.add(ch);   
        return chars; 
    } 
}