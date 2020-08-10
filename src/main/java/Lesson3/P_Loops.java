package Lesson3;

public class P_Loops {
    public static void main(String[] args) {
        //int b[] = {56, 8, 0, -1};

        String names[] = {"Vova", "Vitya", "Max", "AAAA", "BBBB"};

        //for(int i = 0; i < 10; i = i +1) {
        for(int i = 0; i < names.length; i = i + 2) {
            System.out.println("Hello " + names[i]);
        }

        String character = "*";
        for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(character);
            }
            System.out.print("\n");
        }



    }
}
