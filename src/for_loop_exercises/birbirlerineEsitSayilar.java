package for_loop_exercises;

public class birbirlerineEsitSayilar {
    //Question largest and smallest numbers finding
    public static void main(String[] args) {
        int x = 500;
        int y = 500;
        int z = 500;

        if (x>z){
            if (x==y){
                System.out.println("X ve Y birbirlerine esit ve en buyuk sayilardir.");
            }
            else {
                System.out.println("en buyuk sayi X'dir.");
            }
        } else if (x>y) {
            if (x==z){
                System.out.println("X ve Z birbirlerine esit ve en buyuk sayilardir.");
            } else {
                System.out.println("En buyuk sayi X'dir. ");
            }
        } else if (y>z) {
            if (y==x){
            System.out.println("Y ve Z birbirlerine esit ve en buyuk sayilardir.");
            } else {
                System.out.println("En buyuk sayi Y'dir. ");
            }
        } else if (z>x) {
            if (z==y){
                System.out.println("Y ve Z birbirlerine esit ve en buyuk sayilardir.");
            } else {
                System.out.println("En buyuk sayi Z'dir. ");
            }

        } else {
            System.out.println("Verilen tum sayilar birbirlerine esittir.");
        }


    }

}
