package for_while_loop_exercises;
public class StringteTekrarKarakter {
    public static void main(String[] args) {
        // Bir string icindeki tekrarlanan karakterleri konsolda yazdiriniz.

        String s ="accessories";


































        String ts = "";

        for (int i = 0; i <s.length(); i++) {
            String c = s.substring(i,i+1);
            if (s.indexOf(c)!=s.lastIndexOf(c)){
                if (!ts.contains(c)){
                    ts=ts+c;
                }
            }
        }
        System.out.println(ts);

    }
}
