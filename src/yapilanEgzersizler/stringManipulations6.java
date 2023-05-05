package yapilanEgzersizler;

public class stringManipulations6 {
    public static void main(String[] args) {
        //Bir String deðiþkeni oluþturunuz ve String'in ilk ve son karakterlerinin ASCII deðerlerinin
        //toplamýný bulunuz.

        String isim1 = "nbcd efghn";

        String yeniIsim = isim1.trim();

        int sonindex =yeniIsim.length()-1;

        char ilkchar =yeniIsim.charAt(0);
        char sonchar = yeniIsim.charAt(sonindex);
        System.out.println("---------------");
        System.out.println(ilkchar+sonchar);
    }
}
