package xduzenlenecek;

import java.util.Scanner;

public class EmekliOl01 {
    public static void main(String[] args) {
        // Kullanicidan yasini ve cinsiyetini aliniz
        // 10 yasindan kucukler ve 90 yasindan buyuklar için hata mesaji olmalý
        // kadilarda 60 yas ve uzerinde emekli olabilir
        // erkeklerde 65 yas ve uzeri emekli olabilir
        // Emekli olabilirsin veya emekli olamazsýn uyarýsý ver























        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz. E/K ");
        char cinsiyet = scan.nextLine().toLowerCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet =='e')
            if (yas<10 || yas>90) {
            System.out.println("Hatali yaþ girisi yaptiniz");
            }   else if (yas>=65) {
            System.out.println("Emekli olabilirsiniz.");
            }   else if (yas<65) {
            System.out.println("Erken yat! sabah ise gidecen.");
            }
        if (cinsiyet =='k')
            if (yas<10||yas>90) {
            }   else if (yas>=60) {
                System.out.println("Emekli olabilirsiniz.");
            }   else if (yas<60) {
                System.out.println("Erken yat! sabah ise gidecen.");
            }
    }
}
