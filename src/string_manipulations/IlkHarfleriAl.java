package string_manipulations;

public class IlkHarfleriAl {
    public static void main(String[] args) {
        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.

        // "   Ali Can    " ==> AC

        String name = "   ali cAN    ";





















        char first =name.trim().toUpperCase().charAt(0);

        System.out.println(first);//A

        char last =name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println(last);

        System.out.println(""+first+last);//AC
    }
}
