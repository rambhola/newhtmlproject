/*Wrapper Clases- 2 Types of Wrapper Classes - Autoboxing: This is the process of converting primitive data types into their corresponding wrapper classes. For example, converting an int to an Integer, or a double to a Double. So, the statement "Autoboxing Converting Primitives data into their corresponding wrapper classes" is correct.

Unboxing: This is the process of converting objects of wrapper classes back to their primitive data types. For example, converting an Integer back to an int, or a Double back to a double. However, there is a small mistake in the statement */
public class wapper2 {
    public static void main(String[] args) {
        // primitive data types <- wrapper classes
        int intobj = 10;
        double doubleobj = 14.125;
        char charobj = 'A';
        byte byteobj = 'a';
        short shortobj = 10;
        long longobj = 444444;
        // Autoboxing -> Convering Primitives into objects

        Integer = intobj;
        Double = doubleobj;
        Character = charobj;
        Byte = byteobj;
        Short = shortobj;
        Long = longobj;

        // Printing the objects //

        System.out.println(intobj + " ");
        System.out.println(doubleobj + " ");
        System.out.println(charobj + " ");
        System.out.println(byteobj + " "); // it will prining 97
        System.out.println(shortobj + " ");
        System.out.println(longobj + " ");

    }
}