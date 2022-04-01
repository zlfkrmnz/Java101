import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class Sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum, count;
        System.out.print("Sayı : ");
        num = input.nextInt();
        sum = 0; count = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 12 == 0) {
                sum += i; count++;
            }
        }
        System.out.println(sum / count);
    }
}
