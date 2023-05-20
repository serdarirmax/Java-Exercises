package switch_exercises;

public class HangiMevsim2 {
    public static void main(String[] args) {
        /*
        Ay adinin yazili oldugu bir string variable olusturunuz
        a) Aralık, Ocak, Şubat ==> "Kış"
        b) Mart, Nisan, Mayıs  ==> "Ilkbahar"
        c) Haziran, Temmuz, Ağustos  ==> "Yaz"
        d) Eylül, Ekim, Kasım  ==> "Sonbahar"
        e) Diğerleri  ==> "Yanlis giris yaptiniz." ciktisini aliniz.
        */

        String ayAdi = "mart";
































        ayAdi = ayAdi.toLowerCase();
        switch(ayAdi){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Guz");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz.");
                break;
        }
    }
}
