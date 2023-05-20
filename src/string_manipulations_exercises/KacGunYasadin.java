package string_manipulations_exercises;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KacGunYasadin {
    public static void main(String[] args) {
        //Salih'in kac gun yasadıgini bulan kodu yaziniz.
        //Salih'in doğum tarihi 23 Nisan 1920'dir.































        LocalDate dogumtarihi = LocalDate.of(1920,04,23);
        LocalDate bugun = LocalDate.now();
        long yasadigigun = ChronoUnit.DAYS.between(dogumtarihi,bugun);
        System.out.println(yasadigigun+" gundur dunyadasin ama yarinin hicbir garantisi yok.");
    }
}
