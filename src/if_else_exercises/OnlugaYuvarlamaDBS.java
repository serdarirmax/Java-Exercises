package if_else_exercises;

public class OnlugaYuvarlamaDBS {
    public static void main(String[] args) {
        int number = 4555;

        if (number%10>4){
            number =+(number/10+1)*10;
            System.out.println(number);
        }else {
            number =+(number/10)*10;
            System.out.println(number);
        }
    }
}
