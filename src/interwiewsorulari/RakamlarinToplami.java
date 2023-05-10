package interwiewsorulari;

public class RakamlarinToplami {
    /*
     * Kullanicinin girdigi 4 basamakli sayinin rakamlari toplamini veren programi yaziniz.
     */
    public static void main(String[] args) {
        String input = "5458";
        int sayi = Integer.parseInt(input);
        int birlerbas =0;
        int rakamlarToplami = 0;

        for (int i = 0; i < 4; i++) {
            birlerbas=sayi%10;
            rakamlarToplami=+birlerbas;
        }


        ;
        System.out.println(rakamlarToplami);
        birlerbas=sayi/10;
        birlerbas=sayi%10;
        System.out.println(rakamlarToplami);
        rakamlarToplami=+birlerbas;
        birlerbas=sayi/10;
        birlerbas=sayi%10;
        rakamlarToplami=+birlerbas;

        System.out.println(rakamlarToplami);


    }


}
