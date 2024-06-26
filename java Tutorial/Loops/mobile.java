//Java Program to demonstrate the use of the parameterized constructor.  

class mobile {
    String mobname;
    int mobsal;

    // creating a parameterized constructor
    mobile(String n, int s) {
        mobname = n;
        mobsal = s;
    }

    // method to display the values

    void display() {
        System.out.println(mobname + " " + mobsal);
    }

    public static void main(String args[]) {
        mobile ref = new mobile("Oppo", 12999);
        ref.display();

    }
}
