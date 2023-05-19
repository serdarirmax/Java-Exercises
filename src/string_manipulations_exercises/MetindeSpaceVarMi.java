package string_manipulations_exercises;

public class MetindeSpaceVarMi {
    public static void main(String[] args) {
        /*  Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
            olmadığını kontrol etmek için kod yazınız.
            Örnek:
            ‘ William Shakespeare ’ için konsolda false yazmalıdır.
            ‘William Shakespeare   ’ için konsolda false yazmalıdır.
            ‘William Shakespeare’ için konsolda true yazmalıdır.
        */

                String s = " William Shakespeare ";



























                String sTrim = s.trim();
                String sBosluk = sTrim.replaceAll(" ","");
                Boolean ortBslkVarMi = sTrim.length()-sBosluk.length()==1;
                System.out.println("Ortada Space Var mi? "+ortBslkVarMi);
    }
}
