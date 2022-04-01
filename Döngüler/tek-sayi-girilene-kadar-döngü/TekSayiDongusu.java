import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class TekSayiDongusu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum = 0;

        do {
            System.out.print("Sayı : ");
            num = input.nextInt();
            if (num % 4 == 0) sum += num;
        } while (num % 2 == 0);

        System.out.println("Toplam : " + sum);
    }
}
