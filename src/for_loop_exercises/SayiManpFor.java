package for_loop_exercises;
public class SayiManpFor {
    public static void main(String[] args) {
        //Verilen ondalik sayinin sadece ondalik kismindaki rakamlarini, kendisinden önce bir yildiz
        //isaretiyle yazdirmak icin gereken kodu yaziniz.
        //Ornek: 75.4238 ==> *4*2*3*8

        double num = 75.4238;
























        String s = String.valueOf(num);
        int nokta = s.indexOf(".")+1;
        String b ="";
        for (int i = nokta; i <s.length(); i++) {
            String ch = s.substring(i,i+1);
            b +="*"+ch;

        }
        System.out.println(b);
    }
}
