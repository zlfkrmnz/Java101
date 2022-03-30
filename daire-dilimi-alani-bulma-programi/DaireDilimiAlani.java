import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class DaireDilimiAlani {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        System.out.println("Dairenin yarıçapını giriniz:");
        double r = input.nextDouble();
        System.out.println("Daire diliminin açısını giriniz:");
        double aci = input.nextDouble();

        double alan = (PI * (r * r) * aci) / 360;

        System.out.println("Daire diliminin alanı : " + alan);
    }
}
