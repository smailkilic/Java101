import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvliTutar, oran;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen tutarı giriniz: ");
        tutar = scan.nextDouble();

        if (tutar<1001){
            oran = 0.18;
        }
        else{
            oran = 0.08;
        }
        kdvliTutar = tutar+(tutar*oran);
        System.out.println("KDV'li tutar: "+ kdvliTutar);

    }
}