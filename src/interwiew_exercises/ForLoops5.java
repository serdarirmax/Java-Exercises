package interwiew_exercises;

public class ForLoops5 {
    public static void main(String[] args) {
         /*
        String karakterleri teker teker yazd�ran eger a karakterini g�r�rse yazd�rmay� durduran kodu yaz�n�z
         */
        String input = "Yeniden ye�illendi f�nd�k dallar�.";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i)=='a'){
                break;
            }System.out.print(input.charAt(i));
        }
    }
}
