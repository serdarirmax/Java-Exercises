package yapilanegzersizler;

public class stringManipulations8 {
    public static void main(String[] args) {
        //Bir String degiskeni olusturunuz ve son karakteri disindaki tum karakterlerini konsolda
        //buyuk harfle yazdiriniz. Ornek: String 'Java' ise konsola 'JAV' yazdirmalisiniz.

        String str="  Teoman iyi sarki yazar  ";




















        int istenenIndex = str.trim().length()-1;
        String yeniStr = str.trim().substring(0,istenenIndex).toUpperCase();
        System.out.println(yeniStr);



    }
}
