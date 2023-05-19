package string_manipulations_exercises;
public class HarfNoktaKontrolu {
    public static void main(String[] args) {
        /*      Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
                Örnek: ‘Can’ için kodunuz konsolda false yazdırmalıdır
                ‘can.’ için kodunuz konsolda false yazdırmalıdır
                ‘ Can. ’ için kodunuz konsolda false yazdırmalıdır
                ‘Can.’ için kodunuz konsolda true yazdırmalıdır
                ‘CAN.’ için kodunuz konsolda true yazdırmalıdır
        */
        String s = "Fyodor Dostoyevski.";

























        char ilkHarf = s.charAt(0);
        char sonHarf = s.charAt(s.length()-1);
        boolean sondaNokta = sonHarf=='.';
        boolean bastaBuyuk = ilkHarf >='A'&&ilkHarf<='Z';

        System.out.println(sondaNokta && bastaBuyuk ? "DOGRU: Basta buyukharf ve sonda nokta var." : "YANLIS: Yazimda hata yapilmis.");


    }
}
