package Section07;

import java.util.ArrayList;

public class L18_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        // to add to arraylist
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        System.out.println(" ");

        // to remove from an arraylist

        animals.remove(0);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

    }

}
