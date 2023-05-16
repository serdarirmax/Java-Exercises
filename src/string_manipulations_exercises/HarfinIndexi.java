package string_manipulations_exercises;
import java.util.Scanner;
public class HarfinIndexi {
    /*
    Kullanicidan bir String ve bir karakter alin
    Verilen karakterin ilk gorundugu yerin indexini bulun

    input :  AHMET, H
    OUTPUT: 1. index
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



























        System.out.println("Birsey giriniz");
        String str = scan.next();
        String karakter = scan.next();

        System.out.println(str.indexOf(karakter));
    }
}
