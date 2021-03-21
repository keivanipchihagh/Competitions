import java.util.ArrayList;
import java.util.Scanner;

class Quera {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<Integer>();

        for ( ; ; ) {
            int temp = Scan.nextInt();
            if (temp != 0)
                items.add(temp);
            else {
                for (int i = items.size() - 1 ; i >= 0 ; i--) {
                    System.out.println(items.get(i));
                }
                break;
            }
        }
    }
}