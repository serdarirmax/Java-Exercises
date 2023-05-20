package ternary_exercises;
public class UcgeninKenarlari {
    public static void main(String[] args) {
        //  Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".---
        //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "--

        int a = 4;
        int b = 8;
        int c = 4;





























        String str = ((a==b)&&(a!=c))||((b==c)&&(b!=a))||((c==a)&&(c!=b)) ? "ikizkenar ucgen": ((a==b)||(b==c)? "eskenar ucgen":"cesitkenar ucgen");
        System.out.println(str);
    }
}
