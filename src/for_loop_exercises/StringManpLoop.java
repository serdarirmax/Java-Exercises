package for_loop_exercises;

public class StringManpLoop {
    public static void main(String[] args) {
        //  String icindeki (buyuk harfler olmaksizin) kucuk harflerin yanina yildiz isareti koyarak
        //  yazdirmak icin gereken kodu yaziniz.
        //   Ornegin; 'Ali Can?' ==> l*i*a*n*

























        // 1. YONTEM
        String str = "Ali Can?";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z'){
                System.out.print(""+ch+'*');
            }
        }

        System.out.println("");
        // 2. YONTEM
        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]","");
        String t="";
        for (int i = 0; i < s.length(); i++) {
            String r = s.substring(i,i+1);
            t+=r+"*";

        }
        System.out.println(t);
    }
}
