package string_manipulations_exercises;
import java.util.Scanner;
public class IsimYazdir {
    public static void main(String[] args) {

        /* Kullanicidan ismini ve soyismini alin. Konsolda bas harflerini buyuk olarak yazdirin.
         * ferhat => Ferhat
         * kirac => Kirac
         * */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi ve soyisminizi ayri ayri giriniz.");























        String name = scan.next();
        String surname = scan.next();

        String newname = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();

        String newsurname = surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();

        System.out.println(newname+" "+newsurname);


    }
}
