import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r, pi=3.14, merkezAci, alan;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scan.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz: ");
        merkezAci = scan.nextDouble();

        alan = (pi*(r*r)*merkezAci)/360;

        System.out.println("Dairenin alanı: "+ alan);

    }
}