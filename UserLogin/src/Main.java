import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName="patika", pass="java101";
        String secim="q";

        System.out.print("Kullanıcı adınız: ");
        String Login_userName = scan.nextLine();
        System.out.print("Şifreniz: ");
        String Login_pass = scan.nextLine();

        if (Login_userName.equals(userName) && Login_pass.equals(pass)) {
            System.out.println("Giriş yaptınız");
        }

        else if (Login_userName.equals(userName) && !Login_pass.equals(pass)) {
            System.out.println("Şifrenizi yanlış girdiniz!\nŞifrenizi sıfırlamak ister misiniz?\n" +
                    "Şifrenizi sıfırlamak isterseniz lütfen 'q' tuşlayınız");

            scan.nextLine();

            if (secim=="q") {
                System.out.println("Lütfen yeni şifrenizi giriniz..");
                String newPass = scan.nextLine();
                if (newPass.equals(pass)) {
                    System.out.println("Yeni şifre eski şifre ile aynı olamaz!");
                }
                else {
                    System.out.println("Şifreniz oluşturuldu");
                }
            }
        }

        else {
            System.out.println("Bilgileriniz yanlış");
        }
    }
}