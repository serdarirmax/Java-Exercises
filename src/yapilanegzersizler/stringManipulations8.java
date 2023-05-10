package yapilanegzersizler;

public class stringManipulations8 {
    public static void main(String[] args) {
        //Bir String de�i�keni olu�turunuz ve son karakteri d���ndaki t�m karakterlerini konsolda
        //b�y�k harfle yazd�r�n�z. �rnek: String 'Java' ise konsola 'JAV' yazd�rmal�s�n�z.

        String str="  Teoman iyi sarki yazar  ";
        int istenenIndex = str.trim().length()-1;
        String yeniStr = str.trim().substring(0,istenenIndex).toUpperCase();
        System.out.println(yeniStr);



    }
}
