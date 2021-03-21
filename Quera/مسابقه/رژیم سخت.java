import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {            

        
        Scanner Scan = new Scanner(System.in);
        String input = Scan.nextLine();
        int yellow = 0;
        int red = 0;
        int green = 0;
        boolean healthy = true;


        for (int i = 0 ; i < input.length() ; i++) {
            if (input.charAt(i) == 'G')
                green++;
            else if (input.charAt(i) == 'R')
                red++;
            else if (input.charAt(i) == 'Y')
                yellow++;
        }

        if (green ==0)
            System.out.println("nakhor lite");
        else if (yellow >= 2 && red >= 2)
            System.out.println("nakhor lite");
        else if (red >= 3)
            System.out.println("nakhor lite");
        else
            System.out.println("rahat baash");
    }

    public static String removeDuplicate(String string) { 
        String result = new String(); 
        int len = string.length();           
        for (int i = 0; i < len; i++)  
        { 
            char ch = string.charAt(i); 
            if (result.indexOf(ch) < 0) 
                result += ch; 
        }           
        return result; 
    } 
}