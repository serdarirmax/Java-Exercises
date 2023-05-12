package string_manipulations;

import java.util.Scanner;
// ortadaki harfi vermeli islem
public class _18StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan bir strin isteyiniz, bu stringdeki karakter sayisini ekranda yazdiriniz.
























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
