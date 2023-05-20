package ternary_exercises;
public class TernaryPassword {
    public static void main(String[] args) {
        /*
                Sifreyi kontrol etmek için ternary yaziniz.
                8'den fazla karakter iceriyorsa, baş harfi 'i' olmalidir.
                8 karakterden fazla icermiyorsa, baş harfi 'K' olmalidir.
         */
        String sf = "Keklik";










































        String result = sf.length()>8 ? sf.startsWith("i")?"gecerli":"gecersiz" :sf.startsWith("K")?"Gecerli": "gecersiz";
        System.out.println(result);
    }
}
