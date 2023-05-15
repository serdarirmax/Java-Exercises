package if_else_exercises;

import java.util.Scanner;

public class IleBitiyorMu {
    /*
    Kullanicidan bir cumle alin ve birde harf veyahut kelime alin
    Alinan cumle, alinan harf veya kelime ile bitiyor mu kontrol edin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
























        String str = scan.next();
        String sonStr = scan.next();

        if (str.endsWith(sonStr)){
            System.out.println("Olumlu.");
        }else {
            System.out.println("Olumsuz");
        }
    }
}
