package if_else_exercises;

public class WeekAndDays {
    public static void main(String[] args) {
        /*
    Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....*/


        for (int i = 1; i <4; i++) {
            System.out.println("Week"+i);

            for (int j = 1; j <=7 ; j++) {
                System.out.println("Day"+j);
            }System.out.println(".....");
        }
    }
}
