import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class Burclar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month, day;
        System.out.print("Please enter your birth month(1-12) : ");
        month = input.nextInt();
        System.out.print("Please enter your birth day(1-31) : ");
        day = input.nextInt();

        if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {
            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) System.out.println("Koç");
            if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) System.out.println("Boğa");
            if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) System.out.println("İkizler");
            if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) System.out.println("Yengeç");
            if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Aslan");
            if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Başak");
            if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Terazi");
            if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Akrep");
            if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Yay");
            if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) System.out.println("Oğlak");
            if ((month == 2 && day >= 22) || (month == 2 && day <= 19)) System.out.println("Kova");
            if ((month == 1 && day >= 20) || (month == 3 && day <= 20)) System.out.println("Balık");
        }
        else System.out.println("Please enter a valid value.");
    }
}
