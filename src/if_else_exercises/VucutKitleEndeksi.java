package if_else_exercises;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        // Vucut kitle indeksi, vucut agirliginin boy uzunlugunun karesine bolunmesiyle (gr./cm*cm) hesaplanır.
        // islemi gercekleştirip sonucu konsola yazan programi yaziniz
        // vke>30 "Obezsiniz"
        // vke>25 "Kilolusunuz"
        // vke>20 "Ideal kilodasiniz"
        // vke<20 "Zayifsiniz"

        Scanner scan = new Scanner(System.in);






















        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        System.out.println("Lutfen agirliginizi kg. olarak giriniz");
        double kilo= scan.nextDouble();

        double vke = kilo*10000/(boy*boy);
        System.out.println(vke);
        if (vke>30){
            System.out.println("Obezsiniz");
        } else if (vke>=25) {
            System.out.println("Kilolusunuz");
        } else if (vke>=20){
            System.out.println("Ideal kilodasiniz");
        } else if (vke<20){
            System.out.println("Zayifsiniz");
        }


    }
}
