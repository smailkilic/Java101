import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mesafe, yas, yolculuk;
        double yolculukIndirimi, yasIndirimi, ucret, km = 0.10;
        System.out.print("Lütfen gideceğiniz mesafeyi (km) cinsinden girin: ");
        mesafe = scan.nextInt();
        System.out.print("Lütfen yaşınızı girin: ");
        yas = scan.nextInt();
        System.out.println("1- Tek Yön Gidiş\n2- Gidiş Dönüş");
        System.out.print("Lütfen yolculuk tipini girin: ");
        yolculuk = scan.nextInt();

        switch (yolculuk) {
            case 1:
                System.out.println("Yolculuk tipi tek yön gidiş olarak seçildi!");
                break;

            case 2:
                System.out.println("Yolculuk tipi gidiş dönüş olarak seçildi");
                break;
        }
        ucret = mesafe*km;

        if (mesafe>0 && (yolculuk==1 || yolculuk==2) && yas >0) {
            if (yas<12) {
                yasIndirimi = ucret*0.5;
                ucret-=yasIndirimi;
                if (yolculuk==2) {
                    yolculukIndirimi=ucret*0.2;
                    System.out.println("Toplam ücret: "+(ucret-yolculukIndirimi)*2);
                }
                else {
                    System.out.println("İndirimli fiyat: "+(ucret*2));
                }
            }
            else if (yas>=12 && yas<=24) {
                yasIndirimi = ucret*0.1;
                ucret-=yasIndirimi;
                if (yolculuk==2) {
                    yolculukIndirimi=ucret*0.2;
                    System.out.println("Toplam ücret: "+(ucret-yolculukIndirimi)*2);
                }
                else {
                    System.out.println("İndirimli fiyat: "+(ucret*2));
                }
            }
            else if (yas>65) {
                yasIndirimi = ucret*0.3;
                ucret-=yasIndirimi;
                if (yolculuk==2) {
                    yolculukIndirimi=ucret*0.2;
                    System.out.println("Toplam ücret: "+(ucret-yolculukIndirimi)*2);
                }
                else {
                    System.out.println("İndirimli fiyat: "+(ucret*2));
                }
            }
            else {
                if (yolculuk==2) {
                    yolculukIndirimi=ucret*0.2;
                    System.out.println("Toplam ücret: "+(ucret-yolculukIndirimi)*2);
                }
                else {
                    System.out.println("Toplam ücret: "+(ucret*2));
                }
            }
        }
        else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}