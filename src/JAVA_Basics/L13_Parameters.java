package JAVA_Basics;

public class L13_Parameters {

    public static void main(String[] args) {
        getName("Jay", "Rexiti");
    }

    public static void getName(String firstName, String lastName) {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

}
