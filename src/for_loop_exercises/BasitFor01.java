package for_loop_exercises;

public class BasitFor01 {
    public static void main(String[] args) {
        //verilen bir stringde kucuk harfleri konsola yazdirmayiniz.
         //       "PsdR12?Av" ==> PR12?A
        String str = "PsdR12?Av";























        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='a'&&ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }
        }

    }
}
