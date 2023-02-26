import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1, s2, s3;
        System.out.print("Lütfen 1.Sayıyı giriniz --> ");
        s1 = scan.nextInt();
        System.out.print("Lütfen 2.Sayıyı giriniz --> ");
        s2 = scan.nextInt();
        System.out.print("Lütfen 3.Sayıyı giriniz --> ");
        s3 = scan.nextInt();

        if (s1<s2 && s1<s3) {
            if (s2<s3) {
                System.out.println(s1 + "<" + s2 + "<" + s3);
            }
            else {
                System.out.println(s1+"<"+s3+"<"+s2);
            }
        }
        else if (s2<s1 && s2<s3) {
            if (s1<s3) {
                System.out.println(s2+"<"+s1+"<"+s3);
            }
            else {
                System.out.println(s2+"<"+s3+"<"+s1);
            }
        }
        else {
            if (s1<s2) {
                System.out.println(s3+"<"+s1+"<"+s2);
            }
            else {
                System.out.println(s3+"<"+s2+"<"+s1);
            }
        }
    }
}