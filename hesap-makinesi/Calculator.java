import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2;
        int select;

        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Kalan : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0)
                    System.out.println("Belirsiz");
                else
                    System.out.println("Bölüm : " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
