import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class ChineseZodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Your birth year : ");
        int year = input.nextInt();

        int remainder = year % 12;

        String zodiac = switch (remainder) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Raf";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Goat";
            default -> "";
        };
        System.out.println("Your chinese zodiac is " + zodiac);
    }
}
