package if_else_exercises;

public class SifreBasic {
    public static void main(String[] args) {
        /*Password'un ilk harfi buyuk harf ise
        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli
        Passwordun ilk harfi kucuk harf ise
        'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
  */
        String password = "Adana";






















        char ilkHarf = password.charAt(0);

        if (ilkHarf == 'A') {
            System.out.println("Gecerli passwordA");
        } else if (ilkHarf == 'z') {
            System.out.println("Gecerli passwordz");
        } else System.out.println("Gecersiz password");


    }
}