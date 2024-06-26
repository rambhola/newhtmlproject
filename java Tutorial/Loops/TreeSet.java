import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet {

    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("ram");
        tset.add("kamal");
        tset.add("rohan");
        tset.add("pooja");
        System.out.println(tset);

        // using iterator
        Iterator itr = tset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Iterator ditr = tset.descendingIterator();
        while (ditr.hasNext()) {
            System.out.println(ditr.next());
        }
    }
}