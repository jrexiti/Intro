package Section07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L20_Iterator {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();

        animals.add("animal1");
        animals.add("animal2");
        animals.add("animal3");

        Iterator<String> it = animals.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------");

        System.out.println(it.hasNext());
        animals.remove("animal3");
        System.out.println(it.hasNext());

    }
}