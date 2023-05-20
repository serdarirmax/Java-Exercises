package ternary_exercises;
public class PasswordBasic {
    public static void main(String[] args) {
        // Ternary kullanarak:
        // Parola bosluk karakterinden farkli olarak en az 8 karakter iceriyorsa, "Gecerli Parola",
        // Parola bosluk karakterinden farkli olarak 8 karakterden daha az ise, "Gecersiz Parola"
        String password = "elma181";































        System.out.println(password.replaceAll(" ","").length()>7 ? "Gecerli Parola":"Gecersiz Parola");
    }
}
