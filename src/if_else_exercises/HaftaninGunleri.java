package if_else_exercises;
import java.util.Scanner;
public class HaftaninGunleri {
    public static void main(String[] args) {
        //Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz.
        //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  ...
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
































        String day = input.next();

        if (day.equalsIgnoreCase("pazartesi")){
            System.out.println("1. Gun.");
        } else if (day.equalsIgnoreCase("sali")) {
            System.out.println("2. Gun.");
        }else if (day.equalsIgnoreCase("carsamba")) {
            System.out.println("3. Gun.");
        }else if (day.equalsIgnoreCase("persembe")) {
            System.out.println("4. Gun.");
        }else if (day.equalsIgnoreCase("cuma")) {
            System.out.println("5. Gun.");
        }else if (day.equalsIgnoreCase("cumartesi")) {
            System.out.println("6. Gun.");
        }else if (day.equalsIgnoreCase("pazar")) {
            System.out.println("7. Gun.");
        }else {
            System.out.println("Yanlis giris yaptiniz, lutfen tr karakter kullanmadiginizdan emin olunuz.");
        }
    }
}
