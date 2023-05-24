package for_loop_exercises;
public class PalindromMu02 {
    public static void main(String[] args) {
        //  Bir String‘in palindrom olup olmadığını kontrol etmek icin kod yaziniz.
        //  Bir cumlenin tersten okunusuda anyi ise palindromdur, ORNEK ==> "ey edip adanada pide ye"
        String str = "ey edip adanada Pide ye";




























        String terstr = "";
        for (int i = str.length()-1; i >=0; i--) {
            terstr+=str.charAt(i);
        }
        System.out.println(terstr.equalsIgnoreCase(str) ? "Polindromdur." : "Polindrom degildir.");

    }
}
