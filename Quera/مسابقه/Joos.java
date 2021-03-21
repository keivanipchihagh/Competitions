import java.util.Scanner;

public class Quera {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String args[]) {

        String strOne = Scan.nextLine();
        String strTwo = Scan.nextLine();

        String text = "";
        int index = 0;
        
        boolean matched = false;
        for (int i = 0; i < strOne.length(); i++) {            
            matched = false;
            index = i;
            while (text.length() <= strTwo.length()) {
                if (text.equals(strTwo)) {
                    matched = true;
                    break;
                } else {
                    text += strOne.substring(index, index + 1);
                }
                index++;
                if (index == strOne.length())
                    index = 0;
            }

            text = "";
            
            if (matched) {
                System.out.println("Yes");
                break;
            }
        }
        if (!matched)
            System.out.println("No");

    }
}