package yapilanegzersizler;

public class SehirIsmi {
    public static void main(String[] args) {
        /*Sadece tek bir kelimeden olu�an �ehir isimleri i�in bir String de�i�keni olu�turun. �ehir
        ismini, ba� harfi b�y�k ve di�er t�m karakterleri k���k harfler olacak �ekilde konsolda
        yazd�r�n�z.*/

        String sehir = "ANkaRa";

        String sehirY= sehir.trim().toLowerCase();
        sehirY=sehirY.substring(0,1).toUpperCase() + sehirY.substring(1).toLowerCase();
        System.out.println(sehirY);


    }
}
