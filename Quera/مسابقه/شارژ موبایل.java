import java.util.Scanner;

class Quera {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();
        int sum = 0;
        for (int i=0 ; i<=number ; i++)
            sum += i;

        System.out.println(sum);
    }
    
}