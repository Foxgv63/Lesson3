package Lesson3;

public class V_Debug {
    public static void main(String[] args) {
        String name = "";
        for (int i = 0; i < 10; i++) {
            //name = name + "a";
            System.out.println (name);
            if (i%2 == 0) {
                name += "A";
                //System.out.println ("Big a" + i);
            } else {
                name += "a";
                //System.out.println ("Small a" + i);
            }
            //System.out.println ("name on the iteration # " + i + " is: '" + name + "'");
        }
        System.out.println (name);
    }
}
