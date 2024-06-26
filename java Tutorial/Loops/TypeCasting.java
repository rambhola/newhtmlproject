class TypeCasting {
    public static void main(String[] args) {

        // Imlicit TypCasting

        int num1 = 100;// 4 Bytes
        double num2 = num1;// //8 Bytes
        System.out.println(num2);

        // Explicit TypeCasting

        double num3 = 10.36;
        int num4 = (char) num3;

        System.out.println(num4);

    }

}