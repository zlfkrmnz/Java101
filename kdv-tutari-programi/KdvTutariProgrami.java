import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class KdvTutariProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hoş geldiniz. Lütfen hesaplanmasını istediğiniz para miktarını giriniz:");
        double miktar = input.nextDouble();
        double kdv = (miktar < 1000) ? 0.18 : 0.08;
        double kdvTutari = miktar * kdv;
        double kdvliFiyat = miktar + kdvTutari;

        System.out.println("KDV'siz Fiyat = " + miktar);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        System.out.println("KDV tutarı = " + kdv);
    }
}
