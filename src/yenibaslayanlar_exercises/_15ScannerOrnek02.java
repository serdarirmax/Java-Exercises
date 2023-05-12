package yenibaslayanlar_exercises;

import java.util.Scanner;

public class _15ScannerOrnek02 {
    public static void main(String[] args) {

        // SORU: Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.


































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

    public static class _18StringManipulationsASCII {
        public static void main(String[] args) {
            //Bir String degiskeni olusturunuz ve String'in ilk ve son karakterlerinin ASCII degerlerinin
            //toplamini bulunuz.

























            String isim1 = "bu da bana ders olsun";

            String yeniIsim = isim1.trim();

            int sonindex =yeniIsim.length()-1;

            char ilkchar =yeniIsim.charAt(0);
            char sonchar = yeniIsim.charAt(sonindex);
            System.out.println("---------------");
            System.out.println(ilkchar+sonchar);
        }
    }
}
