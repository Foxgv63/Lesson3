package Lesson3;

public class O_Array {
    public static void main(String[] args) {
        int a = 2;
        String name = "Vova";

        int b[] = {56, 8, 0, -1};
        int[] c = {56, 8, 0, -1}; //равнозначная запись
        boolean isBool[] = {true, false, true};
        String strs[] = {"Hello", "world"};
        b[2] = 100000000;

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);

    }


}
