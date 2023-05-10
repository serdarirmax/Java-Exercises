package yapilanegzersizler;

public class ForSicakliklar {
    public static void main(String[] args) {
        //For d�ng�s� kullanarak 50 ile 60 dereceleri aras�ndaki s�cakl�k �lculerini fahrenheit cinsinden ekrana yazd�r�n�z.

        for (int i = 50; i <=60; i++) {
            double f = i*1.8+32;
            System.out.println(i+"derece = "+ f + "fahrenayt");
        }


    }
}
