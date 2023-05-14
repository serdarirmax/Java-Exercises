package if_else_exercises;
import java.util.Scanner;
public class OrtadakiHarf {
    public static void main(String[] args) {

        // Kullanicidan en az 3 harfli bir string isteyiniz,
        // bu stringdeki karakter sayisini tek sayi ise konsola ortadaki harfi yazdiriniz.
        // karakter sayisi cift ise uyarı veriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");























        String str = scan.next();
        char ortaharf= str.charAt(str.length()/2);
        if (str.length()%2!=0 && str.length()>2){
            System.out.println(ortaharf);
        } else {
            System.out.println("sozcuk cift sayida karakter icermektedir.");
        }




    }
}
