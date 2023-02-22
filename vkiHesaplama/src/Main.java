import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double boy, kilo, vki;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();

        vki = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+ vki);

    }
}