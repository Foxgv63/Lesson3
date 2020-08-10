package Lesson3;

public class P3_Foreach {
    public static void main(String[] args) {
        String names[] = {"Vova", "Vitya", "Max", "AAAA", "BBBB"};
        for (String name: names) {
            System.out.println(name);
        }
                //используется только для чтения

        System.out.print("\n");

        for (int i = 0; i < names.length; i++) {
            if (i%2 ==0) {
                names[i] = "********";
            }
            System.out.println(names[i]);

        }

    }
}
