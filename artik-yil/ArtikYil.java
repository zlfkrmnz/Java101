import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class ArtikYil {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
         int year = input.nextInt();

         if ((year % 4 == 0) && !(year % 400 == 0)) System.out.println(year + " bir artık yıldır !");
         else System.out.println(year + " bir artık yıl değildir!");
    }
}
