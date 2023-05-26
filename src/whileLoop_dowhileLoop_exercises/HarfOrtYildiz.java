package whileLoop_dowhileLoop_exercises;
public class HarfOrtYildiz {
    public static void main(String[] args) {
        // Ornek: verilen bir strinde harflerin ortasina * sembolu ekleyiniz.

        String s = "Besiktas";



















        String news ="";
        int i =0;
        while (i<s.length()){
            if(s.length()-1!=i){
                news+=s.charAt(i)+"*";
            }else {
                news+=s.charAt(i);
            }
            i++;
        }
        System.out.println(news);
    }
}
