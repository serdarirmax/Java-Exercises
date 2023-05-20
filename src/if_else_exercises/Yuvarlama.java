package if_else_exercises;
public class Yuvarlama {
    public static void main(String[] args) {

            // Verilen bir sayida, Son basamak 5 ‘e esit ve 5 den buyukse: “Son basamagi bir ust ondaliga yuvarla”
            // Son basamak 5 den kucukse: “Son basamagi bir alt ondaliga yuvarla”
            // kisa ve uzun 2 farkli yoldan yapilabilir.

        int i = 324;





















            //1. YOL
        if (i%10>=5){
            System.out.println((i/10+1)*10);
        } else {
            System.out.println((i/10)*10);
        }

            //2. YOL
        int kalan = i%10;
        if (kalan<=4){
            i=i-kalan;
        } else if (kalan>=5) {
            i=i+kalan;
        }
        System.out.println(i);
    }
}
