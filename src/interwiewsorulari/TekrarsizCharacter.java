package interwiewsorulari;
//Example 9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
//           abbccdc ==> ad
public class TekrarsizCharacter {
    public static void main(String[] args) {
        String a = "aagdgfdedasxawcdrsm";
        for (int i = 0; i <= a.length()-1; i++) {
            if ((a.indexOf(a.charAt(i)))==(a.lastIndexOf(a.charAt(i)))) {
                System.out.println(a.charAt(i));
            }
        }

    }
}
