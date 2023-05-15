package if_else_exercises;

import java.util.Scanner;

public class SuperSayi {
    public static void main(String[] args) {
        // Kullanicidan aldiginiz sayinin 3e ve 5e tam bolunup bolunmedigini hesaplayan
        // 3e bolunuyorsa "uc ile bolunebilen bir tam sayi"
        // 5e bolunuyorsa "5 ile bolunebilen bir tam sayi"
        // her ikisinede bolunebiliyorsa "SUPER SAYI" diye konsola yazdiran bir program yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");

























        int tamsayi = scan.nextInt();

        if (tamsayi%5==0 && tamsayi%3==0){                     //burayı önce olarak koymaz isek görmüyor.
            System.out.println("SUPER SAYI");
        } else if (tamsayi%5==0) {
            System.out.println("bes ile bolunebilen bir tam sayi");
        } else if (tamsayi%3==0) {
            System.out.println("uc ile bolunebilen bir tam sayi");
        } else {
            System.out.println("Malesef bu sayi 3e veya 5e tam bolunmuyor");
        }


    }
}
