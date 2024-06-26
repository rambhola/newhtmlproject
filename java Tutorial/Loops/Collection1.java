
// colectipon framework -> its supports multiple data -> help of 1. ArrayList

// for explme , an ArraKist can hold objects of type - String ,Int 
//Some ArrayListMethods-> add(value),add(index,value),indexof(value),get(index),clear(),remove(),set(index,value),size(),toString

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection1 {
    // Some ArrayListMethods->
    public static void main(String[] args) {
        // Objets
        ArrayList<String> states = new ArrayList<>();
        states.add("MP");
        states.add("rajesthan");
        states.add("harisyana");
        states.add("UP");
        states.add("Chandigadh");
        System.out.println(states);
        // add(index,value)
        states.add(1, "Kashi");
        System.out.println(states);

        /*
         * for (String s : states) {
         * System.out.println(s);
         * }
         */

        // Interator -> -hasNext() //next() //remove()
        // ony used for forward daterctioon it can follow
        // import Interator

        Iterator itr = states.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // ListIterator-Forword -> BackWord
        ListIterator litr = states.listIterator();

        System.out.println("Forword list");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("Backword list");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        states.indexof("MP");

    }

}
