package string_manipulations_exercises;

import java.util.Scanner;

public class StringManipulations45 {
    /*
    Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");



















        String pass = scanner.next();
        boolean ilkBasamak = pass.length()>=8;
        boolean ikinciBasamak = !pass.contains(" ");
        boolean ucuncuBasamak = pass.replaceAll("[^A-Z]","").length()>0;
        boolean dorduncuBasamak = pass.replaceAll("[^a-z]","").length()>0;
        boolean besinciBasamak = pass.replaceAll("[^0-9]","").length()>0;
        boolean sonuc =ilkBasamak&&ikinciBasamak&&ucuncuBasamak&&dorduncuBasamak&&besinciBasamak;
        System.out.println(sonuc);

    }
}
