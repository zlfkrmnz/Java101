import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class ManavKasa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.0;

        double armut_, elma_, domates_, muz_, patlican_;
        System.out.print("Armut kaç kilo ? : ");
        armut_ = armut * (input.nextDouble());
        System.out.print("Elma kaç kilo ? : ");
        elma_ = elma * (input.nextDouble());
        System.out.print("Domates kaç kilo ? : ");
        domates_ = domates * (input.nextDouble());
        System.out.print("Muz kaç kilo ? : ");
        muz_ = muz * (input.nextDouble());
        System.out.print("Patlıcan kaç kilo ? : ");
        patlican_ = patlican * (input.nextDouble());

        double toplam = armut_ + elma_ + domates_ + muz_ + patlican_;

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
