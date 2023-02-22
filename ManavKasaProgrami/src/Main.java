import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a=2.14, e=3.67, d=1.11, m=0.95, p=5, toplam;
        double t1, t2, t3, t4, t5;
        System.out.print("Armut kaç kilo? : ");
        t1 = scan.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        t2 = scan.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        t3 = scan.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        t4 = scan.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        t5 = scan.nextDouble();
        toplam=(t1*a)+(t2*e)+(t3*d)+(t4*m)+(t5*p);
        System.out.println("Toplam Tutar: "+ toplam);

    }
}