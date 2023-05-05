package yapilanEgzersizler;

public class nestedforloop {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            System.out.print(i);
            for (int j = 10; j >i; j--) {
                System.out.println("*");
            }
        }
    }
}
