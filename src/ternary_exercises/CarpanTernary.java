package ternary_exercises;
public class CarpanTernary {
    public static void main(String[] args) {
        // 2 sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "farkli sayilari carpamiyorum" ekran ciktisi veren kodu yaziniz.
        int a=-4;
        int b=2;






























        Object k = (a > 0 && b > 0) || (a < 0 && b < 0) ? a * b : "farkli sayilari carpamiyorum";
        System.out.println(k);

        //OR

        System.out.println((a > 0 && b > 0) || (a < 0 && b < 0) ? a * b : "farkli sayilari carpamiyorum");
    }
}
