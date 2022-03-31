import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class SinifGecmeDurumu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, physics, turkish, chemistry, music;
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz : ");
        physics = input.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkish = input.nextInt();
        System.out.print("Kimya notunuz : ");
        chemistry = input.nextInt();
        System.out.print("Müzik notunuz : ");
        music = input.nextInt();

        if (mat < 0 || mat > 100) mat = 0;
        if (physics < 0 || physics > 100) physics = 0;
        if (turkish < 0 || turkish > 100) turkish = 0;
        if (chemistry < 0 || chemistry > 100) chemistry = 0;
        if (music < 0 || music > 100) music = 0;

        double average = (mat + physics + turkish + chemistry + music) / 5;
        if (average <= 55)
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere.");
        else
            System.out.println("Tebrikler sınıfı geçtiniz.");

        System.out.println("Ortalamanız : " + average);

    }
}
