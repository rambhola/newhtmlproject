class MethodOverloading {
    int add() {
        int num1 = 40, num2 = 460, sum;
        sum = num1 + num2;
        return sum;
    }

    void add(int num3, int num4) {
        int sum;
        sum = num3 + num4;
        System.out.println(sum);
    }

    void add(int num5, double num6) {
        double sum;
        sum = num5 + num6;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodOverloading ref = new MethodOverloading();
        ref.add(900, 1000);
        ref.add(50, 45.55);
        ref.add();
    }

}