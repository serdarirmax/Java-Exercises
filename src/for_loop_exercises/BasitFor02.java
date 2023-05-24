package for_loop_exercises;

public class BasitFor02 {
    public static void main(String[] args) {
        // verilen bir stringte ilk a harfinden onceki
        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"

        String s1 = "I love Java";






















        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }
        }

    }
