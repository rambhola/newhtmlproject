//mulutilevel inharince //
class Student {
    String name;

    void setData(String m) {
        name = m;

    }

    void getData() {
        System.out.println(name);
    }
}

class Fees extends Student {
    int totalFees;

    void setFees(int fee) {
        totalFees = fee;
    }

    void getFees() {
        System.out.println(totalFees);
    }
}

class marks extends Fees {

    int totalFees;

    void setMarks(int n) {
        totalFees = n;
    }

    void getMarks() {
        System.out.println(totalFees);
    }
}

class Student2 {

    public static void main(String[] args) {
        marks n = new marks();
        n.setData("Ram");
        n.setFees(1000);
        n.setMarks(64);

        n.getData();
        n.getFees();
        n.getMarks();
    }
}
