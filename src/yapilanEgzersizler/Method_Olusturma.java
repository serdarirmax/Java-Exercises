package yapilanEgzersizler;

public class Method_Olusturma {

    public static void main(String[] args) {
        System.out.println(asalSayiMi(23));


    }
    public static boolean asalSayiMi(int sayi){
        boolean asalMi = true;
        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                asalMi=false;
            }
        }
        return asalMi;
    }


}
