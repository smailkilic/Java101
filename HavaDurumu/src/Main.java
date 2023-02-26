import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.print("Sıcaklık değerini girin: ");
        sicaklik = scan.nextInt();

        if (sicaklik>=0 && sicaklik<=35) {
            if (sicaklik<=5) {
                System.out.println("Kayak yapabilirsiniz.");
            }
            else if (sicaklik>5 && sicaklik<=15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else if (sicaklik>15 && sicaklik<=25) {
                System.out.println("Piknik yapabilirsiniz.");
            }
            else if (sicaklik>25) {
                System.out.println("Yüzmeye gidebilirsiniz.");
            }
        }
        else {
            System.out.println("Sıcaklık değeri çok yüksek lütfen dışarı çıkmayın!");
        }
    }
}