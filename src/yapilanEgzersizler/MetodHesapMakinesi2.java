package yapilanEgzersizler;

import java.util.Scanner;

public class MetodHesapMakinesi2 {
    public static void main(String[] args) {
        // Kullanýcýdan 2 sayi ve istedigi islemi alin bir method olusturup sayýlara islemi uygulayýn ve
        //sonucu dönduren bir metod olusturun.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz sayilarý sýrasýyla giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi seciniz (+)(-)(*)(/)");
        char islem = input.next().charAt(0);
        System.out.println(islemYapmaMakinesi(sayi1, sayi2, islem));

    }
    public static double islemYapmaMakinesi(double sayi1, double sayi2, char islem) {

        switch (islem) {
            case '+':
                return sayi1 + sayi2;

            case '-':
                return sayi1 - sayi2;

            case '*':
                return sayi1 * sayi2;

            case '/':
                return sayi1 / sayi2;

            default:
                return 0;
        }

    }
}
