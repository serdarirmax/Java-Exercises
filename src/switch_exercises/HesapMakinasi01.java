package switch_exercises;
import java.util.Scanner;
public class HesapMakinasi01 {
    /*
	 Kullanicidan bir sayi iste.  Kullaniciya sececegi sembollerin menusunu goster ve birisini secmesini iste.
          Toplama : 1 Cikarma : 2 Carpma : 3 Bolme :4
     Kullanicidan bir sayi daha iste.
     Sonucu ekranda yazdir.  ORNEK:  INPUT: Num1: 23 ==>  Num2: 55  ==> + ==>  OUTPUT  : Islemin Sonucu : 78
	 SWITCH ILE YAPIN
	 */
    public static void main(String[] args) {




























        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla islem yapmak istediginiz iki sayi giriniz");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Yapmak istediginiz islemi seciniz.\n" +
                "Toplama  : 1\nCikarma  : 2\nCarpma   : 3 \nBolme    : 4\n");

        String secim = scan.next();

        switch (secim){
            case "1":
                System.out.println("Toplama islemi sonucu : "+(num2+num1));
                break;
            case "2":
                System.out.println("Cikarma islemi sonucu : "+(num1-num2));
                break;
            case "3":
                System.out.println("Carpma islemi sonucu : "+(num1*num2));
                break;
            case "4":
                System.out.println("Bolme islemi sonucu : "+(num1/num2));
            default:
                System.out.println("Secimlerinizde hata var tekrar deneyiniz.");
        }


    }
}
