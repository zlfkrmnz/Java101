import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class EtkinlikOnerme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if (heat < 5) System.out.println("Kayak yapabilirsin.");
        else if (heat < 15) System.out.println("Sinemaya gidebilirsin.");
        else if (heat < 25) System.out.println("Pikniğe gidebilirsin.");
        else System.out.println("Yüzmeye gidebilirsin.");

    }
}
