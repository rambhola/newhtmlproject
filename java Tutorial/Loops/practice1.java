import java.util.Scanner;

class output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements in the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max element in the array: " + max);
    }
}

class practice1 {
    public static void main(String[] args) {
        // You can't directly access 'max' from another class
        // If you want to access it, you can create an instance of practice1 and access
        // it through that.
        // However, it's not a good practice to access variables directly between
        // classes like this.
        // You should pass the value as a parameter or return it from a method.
    }
}
