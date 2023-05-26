package whileLoop_dowhileLoop_exercises;
public class SeciliKarakterOncesi {
    public static void main(String[] args) {
        // Bir String de, ilk 'n' karakterinden onceki tum karakterleri yaziniz.
        // once While sonra do-while kullanarak
        String s = "Kertenkele";
























        int m = s.toLowerCase().indexOf("n");
        String ys = "";
        int sayac = 0;
        while (sayac < m) {
            char ch = s.charAt(sayac);
            ys += "" + ch;
            sayac++;
        }
        System.out.println(ys);
        System.out.println("-----------------");

        // Simdide Do-while ile yapalim.





















        String s2 = "kertenkele";
        String ys2 = "";
        int i = 0;
        do {
            String krk = s2.substring(i, i + 1);
            if (krk.equals("n")) {
                break;
            }
            ys2 += "" + krk;
            i++;

        } while (i < s2.length());
        System.out.println(ys2);
    }
}
