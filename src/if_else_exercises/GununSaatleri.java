package if_else_exercises;
import java.time.LocalDate;
import java.time.LocalTime;
public class GununSaatleri {
    public static void main(String[] args) {
        /*
        Eger saat
        i) 24:00 ile 05:00 arasinda ise konsola 'Uyku zamani' yazdiriniz.
        ii) 08:00 ile 16:00 arasinda ise konsola 'Calisma zamani' yazdiriniz.
        iii) 19:00 ile 22:00 arasinda ise konsola 'Aile zamani' yazdiriniz.
        iv) Digerleri icin konsolda 'Kisisel zaman' yazdiriniz.
         */



























        LocalTime bugun = LocalTime.now();
        int saat = LocalTime.now().getHour();
        if (saat>0&&saat<5){
            System.out.println("Uyku zamani");
        } else if (saat>8&&saat<16) {
            System.out.println("Calisma zamani");
        } else if (saat>19&&saat<22) {
            System.out.println("Aile Zamani");
        } else {
            System.out.println("Kisisel zaman");
        }


    }
}
