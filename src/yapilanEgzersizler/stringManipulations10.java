package yapilanEgzersizler;

import java.util.Scanner;

public class stringManipulations10 {
    public static void main(String[] args) {
        // input olarak verilen bir Stringde index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java output: JaVa TERNARY OPERATOR PRATÝK COZUM

        String input = "Serdar";

        for (int i = 0; i <=input.length()-1; i++) {

                System.out.print(i%2==0 ? input.substring(i,i+1).toUpperCase():input.substring(i,i+1).toLowerCase() );
        }





    }
}
