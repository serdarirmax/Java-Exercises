package whileLoop_dowhileLoop_exercises;
public class CveAarasi {
    public static void main(String[] args) {
        //Do-while dongusunu kullanarak konsolda 'C' ile 'A' arasindaki karakterleri yazdirmak icin
        //kod yaziniz.























        char ch ='C';
        String result = "";

        do {
            result+=ch;
            ch--;
        }while (ch>'A');
        System.out.println(result);

        // While ornegi asagida
        System.out.println("--------------------");





















        char krktr = 'C';
        String krk = "";
        while (krktr>'A'){
            krk+=krktr;
            krktr--;
        }
        System.out.println(krk);

    }
}
