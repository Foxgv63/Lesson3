package Lesson3;

public class U_Methods {
    public static void main(String[] args) {
        /*System.out.println("----------------------");
        System.out.printf("Hello '%s'\n", "Vova");
        System.out.println("----------------------");*/
       // System.out.printf("Hello '%s'\n", "Vasya");

        /*greet("Vova");
        greet("Vitya");
        greet("Vasya");
        greet("Max");
        greet("Max", 25);
        greet (2);*/
        int a = 50;
        int b = 30;
        int result = sum(a,b);
        System.out.println (result);
        //System.out.println (sum(a,b));

    }
    public static int sum(int a, int b) {  //int - тип возвращаемого результата
        return a + b;
    }

    public static String getName() {
        return "Vova";
    }



    public static void greet(String name) {  //void - не возвращать значение функции
        System.out.println("----------------------");
        System.out.printf("Hello '%s'\n", name);
        System.out.println("----------------------");
    }
            //одинаковые функции но разные сигнатуры - называется перегрузкой функции

    public static void greet(String name, int age) {
        System.out.println("----------------------" + age);
        System.out.printf("Hello '%s'\n", name);
        System.out.println("----------------------" + age);

    }
    public static void greet(int age) {
        System.out.println ("----------------------" + age);
        System.out.printf ("Hello '%s'\n", "Vova");
        System.out.println ("----------------------" + age);
    }
}
