package string_manipulations_exercises;

public class StringManpltns {
    public static void main(String[] args) {
        // Bir String variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakterleri console'da büyük harflerle yazdırınız
        // java ---> jAVa
        String str = "Besiktas";

























        String ystr = str.substring(0,1).toLowerCase()+str.substring(1,str.length()-1).toUpperCase()+str.substring(str.length()-1).toLowerCase();
        System.out.println(ystr);
    }
}
