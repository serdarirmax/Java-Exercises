package if_else_exercises;
import java.util.Scanner;
public class Donusturator {
    public static void main(String[] args) {
        /*
            Kullanicidan aldiginiz degeri kullanicinin tercihi dogrultusunda
            Mil'den km'ye, saniyeyi saate, fahrenhayti santigrata ceviren bir kod yaziniz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
        "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
        konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
         */
        Scanner scan = new Scanner(System.in);

































        System.out.println("Lutfen donusturmek istediginiz sayiyi giriniz");
        double sayi= scan.nextDouble();
        System.out.println("Yapmak istediginiz islemi arada bosluk birakmadan giriniz " +
                "\n fahrenayttanSantigarata\n mildenkmye\n saniyedensaate");
        String operator = scan.next();

        if (operator.trim().toLowerCase().equalsIgnoreCase("fahrenayttanSantigarata")) {
            System.out.println(sayi+" F ==> "+(sayi-32)*5/9+" km");
        } else if (operator.trim().toLowerCase().equalsIgnoreCase("mildenkmye")) {
            System.out.println(sayi+" mil ==> "+sayi*1.60934+" km");
        } else if (operator.trim().toLowerCase().equalsIgnoreCase("saniyedensaate")) {
            System.out.println(sayi+" saniye ==> "+(sayi/60)/60+" saat");
        }else {
            System.out.println("Hatali giris yaptiniz.");
        }
    }
}
