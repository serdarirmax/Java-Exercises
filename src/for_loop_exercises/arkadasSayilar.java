package for_loop_exercises;
public class arkadasSayilar {
    public static void main(String[] args) {
        //  İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
        //  2 sayi alarak bu sayilarin arkadas sayilar olup olmadigini konsola yazdiran programi yaziniz.


























        int sayi1=220;
        int sayi2=284;
        int sayi1toplami=0;
        int sayi2toplami=0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1%i==0){
                sayi1toplami+=i;
            }
        }
        for (int j = 1; j < sayi2; j++) {
            if (sayi2%j==0){
                sayi2toplami+=j;
            }
        }
        if (sayi1toplami==sayi2&&sayi2toplami==sayi1){
            System.out.println("arkadas sayilar");
        } else {
            System.out.println("tanimaz etmezler");
        }

    }
}

