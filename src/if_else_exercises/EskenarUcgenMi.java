package if_else_exercises;

import java.util.Scanner;

public class EskenarUcgenMi {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);























        System.out.println("Lutfen ucgenin 1. kenar uzunlugunu giriniz");
        int kenar1 = scan.nextInt();
        System.out.println("Lutfen ucgenin 2. kenar uzunlugunu giriniz");
        int kenar2 = scan.nextInt();
        System.out.println("Lutfen ucgenin 3. kenar uzunlugunu giriniz");
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2&&kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }
    }
}
