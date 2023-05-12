package for_while_exercises;

public class stringManipulations10 {
    public static void main(String[] args) {
        // input olarak verilen bir Stringde index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java output: JaVa


        String input = "Teoman";

















        for (int i = 0; i <=input.length()-1; i++) {

                System.out.print(i%2==0 ? input.substring(i,i+1).toUpperCase():input.substring(i,i+1).toLowerCase() );
        }





    }
}
