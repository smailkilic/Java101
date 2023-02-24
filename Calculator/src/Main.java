import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, secim;
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayıyı girin: ");
        n1 = scan.nextInt();
        System.out.print("2.Sayıyı girin: ");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                break;

            case 2:
                System.out.println("Çıkarma: "+(n1-n2));
                break;

            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;

            case 4:
                if (n2!=0) {
                    System.out.println("Bölme"+(n1/n2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;

            default:
                System.out.println("Yanlış giriş yaptınız!\nTekrar deneyiniz..");
        }

    }
}