package interwiew_exercises;
public class WhileInterwiew {
    public static void main(String[] args) {
        // Bir stringteki tekrarsiz karakterleri konsola yazdiriniz.

        String s = "kertenkelle";

















        String tHarf ="";
        int i =0;
        while (i<s.length()){
            char ch = s.charAt(i);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){
            tHarf+=ch;

            }
            i++;
        }
        System.out.println(tHarf);

    }
}
