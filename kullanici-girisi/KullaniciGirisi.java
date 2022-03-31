import java.util.Scanner;

/**
 * @author Zülfükar Minaz
 * @see <a href="https://app.patika.dev/zlfkr">Patika.dev</a>
 */

public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, enteredUserName, enteredPassword;
        userName = "patika";
        password = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        enteredUserName = input.nextLine();

        System.out.print("Şifreniz : ");
        enteredPassword = input.nextLine();

        if (enteredUserName.equals(userName) && enteredPassword.equals(password))
            System.out.println("Giriş Yaptınız.");
        else {
            System.out.println("Bilgileriniz Yanlış. Şifrenizi sıfırlamak ister misiniz.\n1- Evet\n2- Hayır");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Yeni şifrenizi giriniz : ");
                    String trash = input.nextLine(); // Bir önceki kullanıcıdan veri almada int kullandık ve bunun son hanesi boş olduğu için bu satırı yazmazsak newPassword'e bu artığı atar.
                    String newPassword = input.nextLine();
                    if (newPassword.equals(password))
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    else {
                        password = newPassword;
                        System.out.println("Şifre oluşturuldu.");
                    } break;
                case 2:
                    System.out.println("İyi günler.");
                    break;
                default:
                    System.out.println("Geçerli bir seçenek giriniz.");
            }
        }

    }
}
