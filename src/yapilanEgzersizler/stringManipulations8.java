package yapilanEgzersizler;

public class stringManipulations8 {
    public static void main(String[] args) {
        //Bir String deðiþkeni oluþturunuz ve son karakteri dýþýndaki tüm karakterlerini konsolda
        //büyük harfle yazdýrýnýz. Örnek: String 'Java' ise konsola 'JAV' yazdýrmalýsýnýz.

        String str="  Teoman iyi sarki yazar  ";
        int istenenIndex = str.trim().length()-1;
        String yeniStr = str.trim().substring(0,istenenIndex).toUpperCase();
        System.out.println(yeniStr);



    }
}
