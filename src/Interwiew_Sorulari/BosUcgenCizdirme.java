package Interwiew_Sorulari;

import java.util.Scanner;

public class BosUcgenCizdirme {
    public static void main(String[] args) {
        /*

                      *
                     * *
                    *   *
                   *     *
                  * * * * *

            Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();


        for (int i = 1; i <=row ;                   i++) {//satir kontrol
            for (int bosluk = row; bosluk >= i; bosluk--) {// bosluk kontrol
                System.out.print("o");

            }
            for (int yildiz = 1; yildiz <= i; yildiz++) {//* kontrol

                if (yildiz == 1 || yildiz == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == row) {
                    System.out.print("* ");//en alt *
                } else
                    System.out.print("  ");//3. ve 4.satir
            }
            System.out.println();

        }
    }
}
