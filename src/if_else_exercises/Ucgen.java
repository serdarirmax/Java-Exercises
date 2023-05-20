package if_else_exercises;
public class Ucgen {
    public static void main(String[] args) {
        /*
            Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
         */

        int a = 8;
        int b = 6;
        int c = 4;























        if (a == b && b == c){
            System.out.println("Eskenar ucgen");
        } else if ((a == b && a != c)||(b == c && b != a)||(c == a && c !=b)) {
            System.out.println("ikizkenar ucgen");
        } else if (a != b || b != c|| a != c) {
            System.out.println("Cesit kenar ucgen");
        }else {
            System.out.println("girilen verileri kontrol edip tekrar giriniz.");
        }
    }
}
