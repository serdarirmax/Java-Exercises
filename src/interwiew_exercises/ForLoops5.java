package interwiew_exercises;

public class ForLoops5 {
    public static void main(String[] args) {
         /*
        String karakterleri teker teker yazdiran eger a karakterini gorurse yazdirmayi durduran kodu yaziniz
         */
        String input = "Yeniden yesillendi findik dallari.";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i)=='a'){
                break;
            }System.out.print(input.charAt(i));
        }
    }
}
