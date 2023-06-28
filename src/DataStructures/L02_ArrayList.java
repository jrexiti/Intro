package DataStructures;

import java.util.ArrayList;

public class L02_ArrayList {

    public static void main(String[] args) {

        // ArrayLists are resizable

        ArrayList<String> animal = new ArrayList<String>();

        animal.add("Cat");
        animal.add("Dog");
        animal.add("Hamster");
        animal.add("Rabbit");

        System.out.println("Index of Dog: " + animal.indexOf("Dog") + "\n" + "Value at index[1]: " + animal.get(1));

        for (int i = 0; i < animal.size(); i++) {

            System.out.println(animal.get(i));

        }
        System.out.println("----------");
        System.out.println(animal.get(0));

        animal.remove(0);
        System.out.println(animal.get(0));

    }
}
