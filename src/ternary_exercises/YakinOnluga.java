package ternary_exercises;
public class YakinOnluga {
    public static void main(String[] args) {
        /*
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
         */
        int num = 9784;

































        System.out.println(num%10>=5 ? (num/10+1)*10 : (num/10)*10);

    }
}
