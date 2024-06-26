
/* Method OverLoading */
class OverLoading {
    int a = 2000, b = 3000;

    void Add() {
        int sum = a + b;
        System.out.println(sum);
    }

    void Add(int c, int d) {
        int sum = c + d;
        System.out.println(sum);
    }

    void Add(int e, double f) {
        int sum = e + (int) f;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        OverLoading O = new OverLoading();
        O.Add();
        O.Add(500, 400);
        O.Add(70, 45.66);
    }
}