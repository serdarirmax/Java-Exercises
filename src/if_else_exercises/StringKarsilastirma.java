package if_else_exercises;

import java.util.Scanner;

public class StringKarsilastirma {

    /*
     * StringMethods
       2 Metni içerik olarak karsilastiracak programi yaziniz.
          not : Buyuk kucuk harf uyumuna bakilmaksizin.

      ORNEK:

      INPUT      : Zeki Müren'de bizi gorecek mi?
                   zeki müren'de bizi gorecek mi?
      OUTPUT  : False

      INPUT      : Zeki Müren'de bizi gorecek mi?
                   zeki müren'de bizi gorecek mi?
      OUTPUT  : true
     */
    public static void main(String[] args) {























        String str = "Zeki Müren'de bizi gorecek mi?";
        String str2 ="zeKi müren'de bizi gorecek mi?";

        if (str.equalsIgnoreCase(str2)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

}

