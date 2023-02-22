import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c, u;

        Scanner scan = new Scanner(System.in);
        System.out.println("-- Üçgen Alanı Hesaplama --\n");
        System.out.print("Lütfen 1.kenarı giriniz: ");
        a = scan.nextInt();
        System.out.print("Lütfen 2.kenarı giriniz: ");
        b = scan.nextInt();
        System.out.print("Lütfen 3.kenarı giriniz: ");
        c = scan.nextInt();

        u = (a+b+c)/2; // Çevre uzunluğunun yarısı
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı: "+ alan);

    }
}