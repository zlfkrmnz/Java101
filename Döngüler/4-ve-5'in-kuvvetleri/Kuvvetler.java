import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class Kuvvetler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı : ");
        int num = input.nextInt();

        int dort = 4, bes = 5;
        System.out.printf("%4s %10s\n", "4 Katları", "5 Katları");
        while (true) {
            if (dort <= num || bes <= num) {
                if (dort <= num) {
                    System.out.printf("%4d", dort);
                    dort *= 4;
                }
                if (bes <= num) {
                    System.out.printf("%10d\n", bes);
                    bes *= 5;
                }
            } else break;
        }
    }
}
