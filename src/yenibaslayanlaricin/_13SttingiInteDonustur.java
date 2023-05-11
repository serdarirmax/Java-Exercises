package yenibaslayanlaricin;

public class _13SttingiInteDonustur {
    public static void main(String[] args) {
        //Data tipi String olan “43” degerini byte data tipine donusturmek icin bir kod yaziniz ve
        //yine data tipi String olan “5651” degerini short data tipine donusturup konsolda iki
        //degisken arasındaki farki yazdiriniz.





























        String sayi1 = "43";
        String sayi2 = "5651";
        byte nsayi1 = Byte.valueOf(sayi1);
        short nsayi2 = Short.valueOf(sayi2);
        System.out.println(nsayi2-nsayi1);
        // Bu calismayı daha pratik yoldan da yaparabilirsin.
    }
}
