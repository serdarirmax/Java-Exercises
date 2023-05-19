package string_manipulations_exercises;

public class FiyatlarToplami {
    public static void main(String[] args) {
        /*      String skirtPrice = "$22.99";
                String pantsPrice = "$32.99";
                Etek ve pantalon fiyatlarinin toplamini bulmak icin gereken kodu yaziniz.
         */
        String skirtPrice = "$22.99";
        String pantsPrice = "$32.99";



























        String sPrice = skirtPrice.replaceAll("[$]","");
        String pPrice = pantsPrice.replaceAll("[$]","");

        double skirt = Double.valueOf(sPrice);
        double pants = Double.valueOf(pPrice);
        System.out.println("Total price : "+(pants+skirt));


    }
}
