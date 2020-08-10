package Lesson3;

public class S_Ternar {
    public static void main(String[] args) {
        int age = 20;
        /*String greeting;
        if (age < 18) {
            greeting = "Good bye";
        } else {
            greeting = "Hello";
        } */
        String greeting = (age < 18) ? "Goodbye" : "Hello" ; //Однострочность и только два условия
        //или
        /*String greeting = (age < 18)
                ? "Goodbye"
                : "Hello" ;*/

        System.out.println(greeting);
    }
}
