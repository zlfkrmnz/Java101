import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class SayiSiralama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, big, small, middle;

        System.out.print("Birinci Sayı : ");
        num1 = input.nextInt();
        System.out.print("İkinci Sayı : ");
        num2 = input.nextInt();
        System.out.print("Üçüncü Sayı : ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            big = num1;
            if (num2 > num3) {
                small = num3;
                middle = num2;
            }
            else {
                small = num2;
                middle = num3;
            }
        }
        else if (num2 > num1 && num2 > num3) {
            big = num2;
            if (num1 > num3) {
                small = num3;
                middle = num1;
            }
            else {
                small = num1;
                middle = num3;
            }
        }
        else {
            big = num3;
            if (num2 > num1) {
                small = num1;
                middle = num2;
            }
            else {
                small = num2;
                middle = num1;
            }
        }
        System.out.println("Büyükten küçüğe sıralama : " + big + ", " + middle + ", " + small);
        System.out.println("Küçükten büyüğe sıralama : " + small + ", " + middle + ", " + big);
    }
}
