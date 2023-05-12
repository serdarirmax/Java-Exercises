package string_manipulations_exercises;
public class SehirIsmi {
    public static void main(String[] args) {
        /*
        Sadece tek bir kelimeden olusan sehir isimleri icin bir String degiskeni olusturun. Sehir
        ismini, bas harfi buyuk ve diger tum karakterleri kucuk harfler olacak sekilde konsolda
        yazdiriniz.
        */

        String sehir = "ANkaRa";























        String sehirY= sehir.trim().toLowerCase();
        sehirY=sehirY.substring(0,1).toUpperCase() + sehirY.substring(1).toLowerCase();
        System.out.println(sehirY);


    }
}
