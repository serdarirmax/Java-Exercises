package string_manipulations_exercises;
import java.util.Scanner;
public class SifreDogrulama {
    public static void main(String[] args) {
        /*
        //Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
        //ve kullaniciya uygun mesaj veren kodu yaziniz
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");





















        String pass = input.next();

        if (pass.equals("pwd123!")){
            System.out.println("Sisteme giris yapildi.");
        } else {
            System.out.println("Hatali password girisi.");
        }

    }
}
