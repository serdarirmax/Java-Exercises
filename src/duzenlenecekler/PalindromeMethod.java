package duzenlenecekler;

public class PalindromeMethod {
    public static void main(String[] args) {
        String input = "ey edip adanada Pide ye";
        String tersInput = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);
        }
        if (input.equalsIgnoreCase(tersInput)==true){
            System.out.println("Verilen metin palindromdur.");
        } else {
            System.out.println("Verilen metin palindrom degildir.");
        }





    }

}
