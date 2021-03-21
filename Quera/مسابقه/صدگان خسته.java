import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        // Char Array
        char[] input1 = Scan.nextLine().toCharArray();
        char[] input2 = Scan.nextLine().toCharArray();
        String sInput1 = String.valueOf(input1);
        String sInput2 = String.valueOf(input2);

        if ((int)input1[2] > (int)input2[2])
            System.out.println(sInput2 + " < " + sInput1);
        else if ((int)input1[2] < (int)input2[2])
            System.out.println(sInput1 + " < " + sInput2);
        else {
            if ((int)input1[1] > (int)input2[1])
                System.out.println(sInput2 + " < " + sInput1);
            else if ((int)input1[1] < (int)input2[1])
                System.out.println(sInput1 + " < " + sInput2);
            else {
                if ((int)input1[0] > (int)input2[0])
                    System.out.println(sInput2 + " < " + sInput1);
                else if ((int)input1[0] < (int)input2[0])
                    System.out.println(sInput1 + " < " + sInput2);
				else
                    System.out.println(sInput1 + " = " + sInput2);
            }
        }
    }
}