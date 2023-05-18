package interwiew_exercises;
import java.util.Scanner;
public class StringBolme {
    public static void main(String[] args) {
        //Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        //ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi giriniz");























        String name = input.nextLine();
        String pname = name.split(" ")[0];
        String psurmane = name.split(" ")[1];
        System.out.println(pname);
        System.out.println(psurmane);
    }
}
