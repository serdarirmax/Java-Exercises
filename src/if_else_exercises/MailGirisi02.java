package if_else_exercises;
import java.util.Scanner;
public class MailGirisi02 {
    public static void main(String[] args) {
        /*
        Kullanicinin girdigi gmail adresini asagidaki secenekleri baz alarak kontrol edin
        1- girilen metin mail adresi olmali
        2- girilen metin gmail adresi olmali
        3- girilen metinde yazim hatasi olmamali
        4- Basarili girisi bilgilendir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String input =scan.nextLine();



















        if (!input.contains("@")){
            System.out.println("gecersiz mail adresi");
        } else if (!input.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!input.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        } else if (input.startsWith("@gmail.com")) {
            System.out.println("Eksik giris yaptiniz");
        } else {
            System.out.println("Sisteme giris yapildi");
        }
    }
}
