package for_loop_exercises;
import java.util.Scanner;
public class HarfSaymaca {
    public static void main(String[] args) {
        /*
            Kullanicidan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfine rastlanilana kadar gecen a harflerinin sayisini yazdiriniz.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.next().toLowerCase();
        //System.out.println("Kacinci harf oldugunu ogrenmek istediginiz harfi giriniz");

        int sayac = 0;

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)=='a'){
                sayac++;
            } else if (kelime.charAt(i)=='c') {
                break;
            }
        }
        System.out.println(sayac);
    }
}
