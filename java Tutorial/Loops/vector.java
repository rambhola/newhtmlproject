import java.util.*;

class vector {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Kamal");
        list.add("Prakhar");
        list.add("Ajay");
        list.add("Roshan");
        System.out.println("Vector elements are: " + list);
        insertElement(list, "Ashish", 0);
        System.out.println("Vector elements after insertion: " + list);
    }

    // Method to insert an element at a specific index
    public static void insertElement(List<String> list, String element, int index) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, element);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
