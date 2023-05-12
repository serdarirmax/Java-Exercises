package if_else_exercises;

public class OnlugaYuvarlama {
    public static void main(String[] args) {
        int i = 125;
        if(i%10>=5){
            System.out.println("Son basamağı bir üst ondalığa yuvarla : " + (i/10+1)*10);
        }else{
            System.out.println("Son basamağı bir alt ondalığa yuvarla : " + (i/10)*10);
        }
    }
}
