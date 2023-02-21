import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik sınavı notunuzu girin: ");
        mat = scan.nextInt();
        System.out.println("Fizik sınavı notunuzu girin: ");
        fizik = scan.nextInt();
        System.out.println("Kimya sınavı notunuzu girin: ");
        kimya = scan.nextInt();
        System.out.println("Türkçe sınavı notunuzu girin: ");
        turkce = scan.nextInt();
        System.out.println("Tarih sınavı notunuzu girin: ");
        tarih = scan.nextInt();
        System.out.println("Müzik sınavı notunuzu girin: ");
        muzik = scan.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız: "+ sonuc);

        boolean x = sonuc > 60;

        if (x==true){
            System.out.println("Sınıfı geçti.");
        }
        else{
            System.out.println("Sınıfta kaldı.");
        }


    }
}