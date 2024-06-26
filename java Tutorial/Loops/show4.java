class Parent {
    String Son;
    String Cars;
    Double BankBalance;
    String PropertyDocuments;

    Parent(String son, String cars, Double bankbalance, String propertyudocument) {
        Son = son;
        Cars = cars;
        BankBalance = bankbalance;
        PropertyDocuments = propertyudocument;
    }

    void getData() {
        System.out.println("Son Name  " + Son);
        System.out.println("cars names  " + Cars);
        System.out.println("BankBalance  " + BankBalance);
        System.out.println("PropertyDocument " + PropertyDocuments);
    }
}

class Child extends Parent {
    String College;

    Child(String son, String cars, Double bankbalance, String propertyudocument, String college) {
        super(son, cars, bankbalance, propertyudocument);

        College = college;
    }

    void displayChildInfo() {

        System.out.println("Son's College " + College);
    }
}

class Child2 extends Parent {
    String College;

    Child2(String son, String cars, Double bankbalance, String propertyudocument, String college) {
        super(son, cars, bankbalance, propertyudocument);

        College = college;
    }

    void displayChildInfo() {

        System.out.println("Son's College " + College);
    }
}

public class show4 {
    public static void main(String[] args) {
        Child2 c2 = new Child2("Kunal", "Ferrary", 12000.0, "Company License", "MIT");
        c2.getData();
        c2.displayChildInfo();
    }
}
