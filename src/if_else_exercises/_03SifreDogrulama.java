package if_else_exercises;

import java.util.Scanner;

public class _03SifreDogrulama {
    public static void main(String[] args) {
        // Kullanicidan bir @gmail adresi girmesin isteyin
        // Girilen Mail adresi dogru ise mail onaylandi
        // Yanlis ise Gecerli mail adresi girin uyarısı veriniz


























        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi @gmail.com olacak sekilde giriniz");
        String input = scan.next();

        if (input.endsWith("@gmail.com")){
            System.out.println("Mail onaylandi.");
        } else {
            System.out.println("Lutfen gecerli bir mail adresi giriniz.");
        }



    }
}
