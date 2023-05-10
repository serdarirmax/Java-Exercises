package yapilanegzersizler;

public class asal {
    public static void main(String[] args) {
        int input=24;
        int bayrak=0;
        for (int i = 2; i <input; i++) {
            if (input%i==0) System.out.println("Asal degil");
            bayrak++;
        }
    }
}
