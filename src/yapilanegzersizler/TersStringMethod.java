package yapilanegzersizler;

public class TersStringMethod {
    public static void main(String[] args) {
        String ters=terstenYaz("serdar");
        System.out.println(ters);

    }
    public static String terstenYaz(String metin) {
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);

        }return tersMetin;
    }
}

