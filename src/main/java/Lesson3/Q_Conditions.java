package Lesson3;

public class Q_Conditions {
    public static void main(String[] args) {
        int age = 50;
        int salary = 150;

        if (age < 18) {
            System.out.println("Access denied");
        //} else if (age <= 50 && salary > 100) {
        } else if (age <= 50 || salary > 100) {
            System.out.println("Welcome");
        }
          else {
            System.out.println("Good by");
        }

        if(true) System.out.println("sdfsdfvs");
        else System.out.println("jdfjdfhjf");

    }
}
