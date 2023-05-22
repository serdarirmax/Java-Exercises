package for_while_loop_exercises;
public class TekrarEdenCharBul {
    public static void main(String[] args) {
        // Bir stringteki tekrarsiz karakterleri ekrana yadirin.

        String s = "Java beni yorma!";
























        String y ="";

        for (int i = 0; i <= s.length()-1; i++) {
            if ((s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))){
                y+=s.charAt(i);
            }

        }System.out.println(y);


    }
}
