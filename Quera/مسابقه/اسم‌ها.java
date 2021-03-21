import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {            

        int count = Scan.nextInt();
        String firstName = Scan.nextLine();
        int output = firstName.length();
        for (int i = 0; i < count; i++) {
            int temp = variedCharsCount(Scan.nextLine());
            if (temp > output)
                output = temp; 
        }
        System.out.println(output);
    }

    public static int variedCharsCount(String name) {

        List<String> nameChars = new ArrayList<String>();
        for (int i = 0; i < name.length(); i++)
            nameChars.add(String.valueOf(name.charAt(i)));

        String temp = "";
        for (int i = 0; i < nameChars.size(); i++) {
            temp +=String.valueOf(nameChars.get(i));
            Collections.replaceAll(nameChars,String.valueOf(nameChars.get(i)), "");
        }
        return temp.length();
    }
}