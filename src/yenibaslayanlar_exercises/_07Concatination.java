package yenibaslayanlar_exercises;

public class _07Concatination {
    public static void main(String[] args) {
        //Bir String ve iki long data tipinde degisken olusturunuz. Konsolda bu long degiskenlerin
        //toplamini ve carpimini String ile yazdiriniz.

        String s = "Sonuc : ";
        long l1 = 5646688L;
        long l2 = 4565485L;
        System.out.println(s+(l2+l1));
        System.out.println(s+(l1*l2));
    }
}
