package whileLoop_dowhileLoop_exercises;
public class HarfSonunaYildiz {
    public static void main(String[] args) {
        // Ornek: verilen bir strinde her harfin sonrasina * sembolu ekleyiniz.

        String s = "Besiktas";
























        String news ="";
        int i =0;
        while (i<s.length()){
            news+=s.charAt(i)+"*";

            i++;
        }
        System.out.println(news);
    }
}
