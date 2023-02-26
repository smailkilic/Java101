import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogumYili,zodyakHesap;
        System.out.print("Doğum yılınızı girin: ");
        dogumYili = scan.nextInt();
        String zodyakBurc = "";

        zodyakHesap = dogumYili%12;
        if (zodyakHesap==0) {
            zodyakBurc = "Maymun";
        }
        else if (zodyakHesap==1) {
            zodyakBurc = "Horoz";
        }
        else if (zodyakHesap==2) {
            zodyakBurc = "Köpek";
        }
        else if (zodyakHesap==3) {
            zodyakBurc = "Domuz";
        }
        else if (zodyakHesap==4) {
            zodyakBurc = "Fare";
        }
        else if (zodyakHesap==5) {
            zodyakBurc = "Öküz";
        }
        else if (zodyakHesap==6) {
            zodyakBurc = "Kaplan";
        }
        else if (zodyakHesap==7) {
            zodyakBurc = "Tavşan";
        }
        else if (zodyakHesap==8) {
            zodyakBurc = "Ejderha";
        }
        else if (zodyakHesap==9) {
            zodyakBurc = "Yılan";
        }
        else if (zodyakHesap==10) {
            zodyakBurc = "At";
        }
        else {
            zodyakBurc = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+zodyakBurc);
    }
}