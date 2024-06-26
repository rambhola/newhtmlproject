
// Hashmap like Disctionary in python 
// Dublicte data Tyepe not allowed 
import java.util.*; // The import java.util *; statement is a Java import statement that imports all of the classes in the java.util package into the current compilation unit. This means that all of the classes in the java.util package can be used without specifying their fully qualified names.

public class HashMap1 {
    public static void main(String[] args) {
        // objects of Hashmap -> <classname,datatype> -> object name ->
        // put funtion used to input - key,value
        HashMap<Integer, String> smap = new HashMap<>();
        smap.put(101, "Rahul");
        smap.put(102, "reena");
        smap.put(103, "hitesh");
        smap.put(104, "Mukesh");
        System.out.println(smap);

        // map is interfac // m reffrene // entery set like exmaple -> 1001=rahul
        /*
         * for (Map.Entry m : smap.entrySet()) {
         * System.out.println(m);
         * }
         */
        System.out.println(smap.entrySet());
        System.out.println(smap.keySet());
        // smap.clear();

        /*
         * System.out.println(smap.values());
         * System.out.println(smap.size());
         * System.out.println(smap.get(104));
         * smap.remove(101);
         * System.out.println(smap);
         * smap.replace(103, "Kamal");
         * System.out.println(smap);
         */

    }

}
