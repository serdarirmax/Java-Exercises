package for_while_loop_exercises;

public class CarpimTabLoop {
    public static void main(String[] args) {
        // Asagidaki carpim tablosunu olusturmak icin kod yaziniz.
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30






















        for (int i=3;i<=3;i++){
            for (int j = 1; j <11; j++) {
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
        }
        System.out.println("^_^");

        // Basit Yontem
        int num = 3;
        for (int i = 1; i <11; i++) {
            System.out.print(num+"x"+i+"="+num*i+" ");
        }

    }
}
