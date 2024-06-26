abstract class Shape {
    abstract double area();

    abstract void shapeName(String n);

    abstract void program(String m);

}

class Circle extends Shape {

    private double radius;

    void setData(double num1) {
        radius = num1;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    void shapeName(String name) {

        System.out.println(name);

    }

    void program(String name1) {
        System.out.println(name1);
    }
}

class show {

    public static void main(String[] args) {
        Circle C = new Circle();

        C.setData(5.0);
        C.shapeName("Circle");
        C.program("welcome");
        System.out.println(C.area());

    }
}