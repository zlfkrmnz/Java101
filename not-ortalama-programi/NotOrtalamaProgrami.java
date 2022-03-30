import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class NotOrtalamaProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hoş geldiniz sayın kullanıcılar.");

        System.out.println("Matematik notunuzu giriniz:");
        double mat = input.nextDouble();
        System.out.println("Fizik notunuzu giriniz:");
        double fizik = input.nextDouble();
        System.out.println("Kimya notunuzu giriniz:");
        double kimya = input.nextDouble();
        System.out.println("Türkçe notunuzu giriniz:");
        double turkce = input.nextDouble();
        System.out.println("Tarih notunuzu giriniz:");
        double tarih = input.nextDouble();
        System.out.println("Müzik notunuzu giriniz:");
        double muzik = input.nextDouble();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        String str = (ort >= 60) ? "Geçti." : "Kaldı.";

        System.out.println(str);
    }
}
