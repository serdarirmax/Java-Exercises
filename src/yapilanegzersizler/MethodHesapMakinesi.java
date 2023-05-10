package yapilanegzersizler;

import java.util.Scanner;

public class MethodHesapMakinesi {
    public static void main(String[] args) {
        // Kullan�c�dan 2 sayi ve istedigi islemi alin bir method olusturup say�lara islemi uygulay�n ve
        //sonucu d�nduren bir metod olusturun.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen islem yapmak istediginiz sayilar� s�ras�yla giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println("Lutfen yapmak istediginiz islemi seciniz (+)(-)(*)(/)");
        char islem = input.next().charAt(0);
        islemYapMakinesi(sayi1,sayi2,islem);
    }
    public static void islemYapMakinesi(int sayi1, int sayi2, char islem){
        if (islem=='+'){
            System.out.println("Toplama islemi sonucu = "+(sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Cikarma islemi sonucu = "+(sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("Carpma islemi sonucu = "+(sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("Bolme islemi sonucu = "+(sayi1/sayi2));
        } else {
            System.out.println("Yapilan girislerde hata olustu.");
        }
    }
}
