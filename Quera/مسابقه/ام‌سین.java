import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int count = Scan.nextInt();
        String[] materials = new String[] {"sib", "samanoo", "sekke", "senjed", "somagh", "serke", "sabze"};

        for (int i = 0 ; i < count ; i++)
            System.out.println(materials[i]);
    }
}