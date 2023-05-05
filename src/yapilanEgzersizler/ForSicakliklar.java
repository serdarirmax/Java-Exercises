package yapilanEgzersizler;

public class ForSicakliklar {
    public static void main(String[] args) {
        //For döngüsü kullanarak 50 ile 60 dereceleri arasýndaki sýcaklýk ölculerini fahrenheit cinsinden ekrana yazdýrýnýz.

        for (int i = 50; i <=60; i++) {
            double f = i*1.8+32;
            System.out.println(i+"derece = "+ f + "fahrenayt");
        }


    }
}
