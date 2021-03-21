import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {            

        int L = Scan.nextInt();
        int R = Scan.nextInt();
        Scan.close();
        
        String string = "1";
        while (string.length() < R) {
            string += counterBinary(string);
        }
        System.out.println(string.substring(L - 1, R));
    }

    public static String counterBinary(String string) {

        StringBuilder SB = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (SB.charAt(i) == '1')
                SB.setCharAt(i,'0');
            else
                SB.setCharAt(i,'1');
        }   
        return String.valueOf(SB);
    }
}