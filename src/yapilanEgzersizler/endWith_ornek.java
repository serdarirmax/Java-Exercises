package yapilanEgzersizler;

import java.util.Scanner;

public class endWith_ornek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi @gmail.com olacak þekilde giriniz");
        String input = scan.next();

        if (input.endsWith("@gmail.com")){
            System.out.println("Mail onaylandý.");
        } else {
            System.out.println("Lutfen gecerli bir mail adresi giriniz.");
        }



    }
}
