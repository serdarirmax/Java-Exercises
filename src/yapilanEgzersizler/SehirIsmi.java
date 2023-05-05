package yapilanEgzersizler;

public class SehirIsmi {
    public static void main(String[] args) {
        /*Sadece tek bir kelimeden oluþan þehir isimleri için bir String deðiþkeni oluþturun. Þehir
        ismini, baþ harfi büyük ve diðer tüm karakterleri küçük harfler olacak þekilde konsolda
        yazdýrýnýz.*/

        String sehir = "ANkaRa";

        String sehirY= sehir.trim().toLowerCase();
        sehirY=sehirY.substring(0,1).toUpperCase() + sehirY.substring(1).toLowerCase();
        System.out.println(sehirY);


    }
}
