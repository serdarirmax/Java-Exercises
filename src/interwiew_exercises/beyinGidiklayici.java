package interwiew_exercises;


public class beyinGidiklayici {
    public static void main(String[] args) {

        // deger atamadan iki de�i�kenin yerlerini degistiriniz (BEYIN GIDIKLAYICI)
        int a = 400;
        int b = 23;
        System.out.println("a :" + a + " b :" + b);

        a = a + b; // a = 30  b = 20
        b = a - b; // b = 10  a = 30
        a = a - b; // a = 20  b = 10

        System.out.println("Degiskenler degistirildi...\n"+ "a :" + a + " b :" + b);
    }


}
