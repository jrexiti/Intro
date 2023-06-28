package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L03_Lists {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<String>();

        elements.add("el1");

        Iterator<String> it = elements.iterator();

        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        elements.add("el2");
        System.out.println(it.hasNext());
        elements.remove(1);
        System.out.println(it.hasNext());

    }

}