package for_loop_exercises;
public class RakamlarTplmi01 {
    public static void main(String[] args) {
        //  Verilen bir tamsayinin rakamlarinin toplamini bulan kodu yaziniz.
        //  Ornek:   3988  ==> 3+9+8+8 = 28

























        int sayi=3988;
        int rakamToplami = 0;
        for (int i = sayi; i >0; i=i/10) {
            rakamToplami+=i%10;
        }
        System.out.println(rakamToplami);
    }
}
