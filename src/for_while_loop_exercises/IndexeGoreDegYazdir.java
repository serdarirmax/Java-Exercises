package for_while_loop_exercises;

public class IndexeGoreDegYazdir {
    public static void main(String[] args) {
        // verilen kucuk harfler ile yazilmis stringin indexi cift olan karakterlerini
        // buyuk harf ile yazdiran java kodunu yaziniz.
        // Ornek :  ankara ==> AKR






























        // 1. YONTEM
        String str = "ankara";
        String ystr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                ystr += str.substring(i, i + 1).toUpperCase();
            }
        }
        System.out.println(ystr);


        // 2. YONTEM
        String s = "ankara";

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {

                System.out.print(ch.toUpperCase());
            }
        }
    }
}
