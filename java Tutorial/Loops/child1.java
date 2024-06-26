/* Single Level Inheritance */
class Parents {
    void Properties1() {
        String Home = "Home";
        String Cars = "  'Hyundai ', 'Audi' ,'Honda','Porsche' ";

    }

    class child1 extends Parents {
        void Properties2() {
            double BankBalance = 19874568;

        }

    }

    class TestInheritance {
        public static void main(String[] args) {
            child1 ref = new child1();
            ref.Properties1();
            ref.Properties2();

        }
    }
}