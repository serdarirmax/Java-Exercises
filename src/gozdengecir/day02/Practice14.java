package gozdengecir.day02;

public class Practice14 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     *
     * 1. Adım : Scanner sınıfından nesne üretelim.
     * 2. Adım : Kullanıcıdan saniye alalım.
     * 3. Adım : Saniyeyi 3600'a bölerek saati bulalım.
     * 4. Adım : Saniyeyi 3600'a böldükten sonra kalanı alalım ve onu 60'a bölerek dk'yı bulalım.
     * 5. Adım : Dk'yı bulduktan sonra kalanı saniye olarak yazalım.
     *
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */
    public static void main(String[] args) {
        int input = 564465640;
        int sn = 3600;
        double saat = input/sn;
        double dk = saat/60;
        double s=saat%60;
        System.out.println(s);



    }
}
