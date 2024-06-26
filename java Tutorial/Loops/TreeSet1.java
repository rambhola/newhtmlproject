import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("ram");
        tset.add("kamal");
        tset.add("rohan");
        tset.add("pooja");

        // using iterator
        /*
         * Iterator itr = tset.iterator();
         * while (itr.hasNext()) {
         * System.out.println(itr.next());
         * }
         * System.out.println("// DescendingOrder //");
         * Iterator ditr = tset.descendingIterator();
         * while (ditr.hasNext()) {
         * System.out.println(ditr.next());
         * }
         */
        System.out.println(tset);
        System.out.println(tset.pollLast());
        System.out.println(tset.pollFirst());
        System.out.println(tset.());

    }

    // pollFIrst-> it will give elements but otherhand it wiil Remove from the
    // Treeset
    // pollLast ->
    // Clear() -> it will return empty list
    // Size()-> it will return size of the elments
    // Remove () -> it will remove particular elements

    // System.out.println(tset.pollLast());
}