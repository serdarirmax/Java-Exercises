package string_manipulations_exercises;

import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KacAyYasadin {
    public static void main(String[] args) {
        //  Ela'nin kaç ay yaşadığını bulan kodu yazınız.
        //  Ela'nin doğum tarihi :  14 Haziran 2003

























        LocalDate dogtarihi = LocalDate.of(2003,06,14);
        LocalDate bugun = LocalDate.now();
        long yasananay = ChronoUnit.MONTHS.between(dogtarihi,bugun);
        System.out.println(yasananay);


    }
}
