import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik, top=0, dersSayisi=0;

        System.out.print("Matematik notunuz: ");
        mat=scan.nextInt();
        if (mat>=0 && mat<=100) {
            top+=mat;
            dersSayisi++;
        }

        System.out.print("Fizik notunuz: ");
        fizik=scan.nextInt();
        if (fizik>=0 && fizik<=100) {
            top+=fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce=scan.nextInt();
        if (turkce>=0 && turkce<=100) {
            top+=turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuz: ");
        kimya=scan.nextInt();
        if (kimya>=0 && kimya<=100) {
            top+=kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunuz: ");
        muzik=scan.nextInt();
        if (muzik>=0 && muzik<=100) {
            top+=muzik;
            dersSayisi++;
        }
        double ort = top / dersSayisi;

        if (ort>=55) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız: "+ort);
    }
}