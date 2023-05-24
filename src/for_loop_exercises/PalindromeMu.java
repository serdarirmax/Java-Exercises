package for_loop_exercises;

public class PalindromeMu {
    public static void main(String[] args) {
        //  Bir String‘in palindrom olup olmadığını kontrol etmek icin kod yaziniz.
        //  Bir cumlenin tersten okunusuda anyi ise palindromdur, ORNEK ==> "ey edip adanada pide ye"
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
