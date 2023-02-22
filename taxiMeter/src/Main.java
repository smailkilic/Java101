import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acilisUcret;
        double odenecekTutar, mesafe, km = 2.20;
        acilisUcret=10;

        System.out.print("Lütfen mesafeyi KM cinsinden giriniz: ");
        mesafe = scan.nextDouble();

        odenecekTutar=(mesafe*km);

        if (mesafe<9.1) {
            System.out.print("Ödenecek tutar: 20 TL");
        }
        else {
            System.out.print("Ödenecek tutar: "+(odenecekTutar+acilisUcret));
        }
    }
}