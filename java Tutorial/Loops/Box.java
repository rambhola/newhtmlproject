// Method Overloading
class Box {

    int area(int length) {
        return length * 1 * 1;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    int area(int length, int breadth, int height) {
        return length * breadth * height;
    }
}

class Main {
    public static void main(String arg[]) {

        Box b1 = new Box();
        int area = b1.area(5, 5, 5);
        System.out.println(area);

    }
}
