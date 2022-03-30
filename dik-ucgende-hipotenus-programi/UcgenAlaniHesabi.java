import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class UcgenAlaniHesabi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hoş geldiniz. Lütfen alanını bulmak istediğiniz üçgenin kenar uzunluklarını giriniz.");
        System.out.print("1. Kenar: ");
        double a = input.nextDouble();
        System.out.println("\n2. Kenar: ");
        double b = input.nextDouble();
        System.out.println("\n3. Kenar: ");
        double c = input.nextDouble();

        double u = (a+b+c) / 2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
