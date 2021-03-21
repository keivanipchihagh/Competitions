import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {            
        
        int count = Scan.nextInt();         
        BigInteger sum = new BigInteger("0");
         
        for (int i = 0 ; i < count ; i++)
            sum = sum.add(Scan.nextBigInteger());
        System.out.println(sum);
    }
}