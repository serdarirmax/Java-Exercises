package if_else_exercises;
import java.util.Scanner;
public class MailChange {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir e-posta adresi girmesini isteyin,
        ardından "hotmail" içeriyorsa "gmail" ile değiştirin,
        örneğin: beyazitliprens@hotmail.com ==> beyazitliprens@gmail.com
         */

        System.out.println("E-mail adresinizi giriniz");
        String email = new Scanner(System.in).next();


















        if (email.contains("@hotmail")){
            System.out.println(email.replaceAll("@hotmail","@gmail"));
        }










    }
}
