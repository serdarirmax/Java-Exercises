package string_manipulations_exercises;

public class NoktalamaIsaretleriSayisi {
    public static void main(String[] args) {
        // Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

        String s = "Inanilmaz! 30.000 tl maas mı? Yok canim daha neler...";



























        int ilkHali =s.length();
        int sonhali = s.replaceAll("\\p{Punct}","").length();
        System.out.println("Noktalama isaretleri sayisi : "+(ilkHali-sonhali));
    }
}
