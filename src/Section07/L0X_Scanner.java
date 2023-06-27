package Section07;

import java.util.Scanner;

public class L0X_Scanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("WHat is your name?");
        String response = s.nextLine();
        System.out.println("You responded with " + response);

    }
}
