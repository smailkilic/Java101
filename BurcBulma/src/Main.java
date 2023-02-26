import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month, day;
        String burc = "";
        boolean isError = false;

        System.out.print("Lütfen doğduğunuz ayı (1-12) girin: ");
        month = scan.nextInt();

        if (month>=1 && month<=12) {
            if (month==1) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<22) {
                        burc = "Oğlak burcu";
                    }
                    else {
                        burc = "Kova burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==2) {
                System.out.print("Lütfen doğduğunuz günü (1-28) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=28) {
                    if (day<20) {
                        burc = "Kova burcu";
                    }
                    else {
                        burc = "Balık burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==3) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<21) {
                        burc = "Balık burcu";
                    }
                    else {
                        burc = "Koç burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==4) {
                System.out.print("Lütfen doğduğunuz günü (1-30) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=30) {
                    if (day<21) {
                        burc = "Koç burcu";
                    }
                    else {
                        burc = "Boğa burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==5) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<22) {
                        burc = "Boğa burcu";
                    }
                    else {
                        burc = "İkizler burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==6) {
                System.out.print("Lütfen doğduğunuz günü (1-30) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=30) {
                    if (day<23) {
                        burc = "İkizler burcu";
                    }
                    else {
                        burc = "Yengeç burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==7) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<23) {
                        burc = "Yengeç burcu";
                    }
                    else {
                        burc = "Aslan burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==8) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<23) {
                        burc = "Aslan burcu";
                    }
                    else {
                        burc = "Başak burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==9) {
                System.out.print("Lütfen doğduğunuz günü (1-30) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=30) {
                    if (day<23) {
                        burc = "Başak burcu";
                    }
                    else {
                        burc = "Terazi burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==10) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<23) {
                        burc = "Terazi burcu";
                    }
                    else {
                        burc = "Akrep burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==11) {
                System.out.print("Lütfen doğduğunuz günü (1-30) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=30) {
                    if (day<22) {
                        burc = "Akrep burcu";
                    }
                    else {
                        burc = "Yay burcu";
                    }
                }
                else {
                    isError = true;
                }
            }

            else if (month==12) {
                System.out.print("Lütfen doğduğunuz günü (1-31) girin: ");
                day = scan.nextInt();
                if (day>=1 && day<=31) {
                    if (day<22) {
                        burc = "Yay burcu";
                    }
                    else {
                        burc = "Oğlak burcu";
                    }
                }
                else {
                    isError = true;
                }
            }
        }
        else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz!");
        }
        else {
            System.out.println("Burcunuz: "+burc);
        }
    }
}