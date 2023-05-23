package for_while_loop_exercises;

public class StrgTrsCevir {
    public static void main(String[] args) {
        // Bir String’ i tersine cevirmek icin kod yaziniz.
        // Ornek;   Mark ==> kraM

        String s = "Zeki Muren";
        String b = "";

        for (int i=s.length()-1 ; i>=0 ; i--){
            String ch=s.substring(i,i+1);
            b+=ch;
        }
        System.out.println(b);
        ////////////////////////////////////////////////
        String f = "Soner Sarikabadayi";
        StringBuilder sf = new StringBuilder(f);
        System.out.println(sf.reverse());


    }
}
