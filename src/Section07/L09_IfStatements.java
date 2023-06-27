package Section07;

public class L09_IfStatements {

    public static void main(String[] args) {

        ifExample();
        ifExample2();
        ifExample3();

    }

    public static void ifExample() {
        if (10 > 9) {
            System.out.println("10 is greater than 9");
        }

    }

    public static void ifExample2() {
        int hour = 13;
        int midday = 12;
        if (hour >= midday) {
            System.out.println("Good afternoon!");

        } else {
            System.out.println("Good morning!");
        }
    }

    public static void ifExample3() {
        int hour = 19;
        int midday = 12;
        int afternoon = 18;

        if (hour >= midday && hour <= afternoon) {
            System.out.println("Good afternoon!");
        } else if (hour >= midday && hour > afternoon) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good morning!");
        }

    }

}
