package yenibaslayanlaricin;

import java.util.Scanner;

public class _04_03GalonToLitre {
    public static void main(String[] args) {
        double litre=3.785;
        // Kullanicidan litreye cevirmek istedigi sayiyi galon cinsinden aliniz ve
        // islem sonrasi kullanıcıya dönus yapiniz 1 Galon == 3.785 Litre
























        System.out.println("Litreye donusturmek istediginiz galonu yaziniz");
        double galon= new Scanner(System.in).nextDouble();

        double veri=litre*galon;

        System.out.println(galon+" galon ="+ veri + "litre");


    }
}
