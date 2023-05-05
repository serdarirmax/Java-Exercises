package java_pratikleri;

import java.util.Scanner;

public class ScannerOrnek02 {
    public static void main(String[] args) {

        // SORU: Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.
        // Sen buradan başla sorunun cozumu asagida. Basarilar

































        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String Isim= scanner.nextLine();
        System.out.println("Lutfen soyisminiz giriniz");
        String Soyisim= scanner.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scanner.nextInt();
        System.out.println("Isminiz    : "+Isim +  "\nSoyisminiz : "+Soyisim+ "\nYasiniz    : "+yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
    }
}
