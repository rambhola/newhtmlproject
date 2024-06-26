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

public class Child {

    public static void main(String[] args) {
        Parent p1 = new Parent("Roshan", "Ferrary", 12000.0, "Company License");
        p1.getData();
    }
}
