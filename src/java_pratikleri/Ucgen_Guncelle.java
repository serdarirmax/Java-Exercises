package java_pratikleri;

public class Ucgen_Guncelle {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        if (a==b||b==c||a==c){
            System.out.println("İkiz kenar ucgen");
        } else if (a==b&&b==c) {
            System.out.println("eşkenar ucgen");
        } else if (a!=b&&b!=c&&c!=a) {
            System.out.println("Cesit kenar ucgen");
        } else {
            System.out.println("girilen degerler gecersiz");
        }

    }
}
