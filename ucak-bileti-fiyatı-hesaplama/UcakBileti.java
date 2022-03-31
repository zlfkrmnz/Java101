import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class UcakBileti {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance, age, typeOfTravel;
        double chargePerDistance, totalCharge;
        chargePerDistance = 0.1;

        System.out.print("Please enter distance(km) of your travel : ");
        distance = input.nextInt();
        System.out.print("Please enter your age : ");
        age = input.nextInt();
        System.out.print("Please choose your travel type (1 => one way, 2 => round-trip) : ");
        typeOfTravel = input.nextInt();

        totalCharge = distance * chargePerDistance;

        if ((distance >= 0) && (age >= 0) && ((typeOfTravel == 1) || (typeOfTravel == 2)) ) {
            if (age <= 12) totalCharge -= totalCharge * 0.5;
            else if (age <= 24) totalCharge -= totalCharge * 0.1;
            else if (age >= 65) totalCharge -= totalCharge * 0.3;
            if (typeOfTravel == 2) totalCharge = (totalCharge - (totalCharge * 0.2)) * 2;
            System.out.println("Total Charge = " + totalCharge + " TL");
        }
        else System.out.println("Entered an invalid value.");
    }
}
