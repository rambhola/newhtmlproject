/* Single Level Inheritance */
class Parents {
    void Properties1() {
        /*
         * String Home = "Home";
         * String Cars = "  'Hyundai ', 'Audi' ,'Honda','Porsche' ";
         */System.out.println("This is Parents class");

    }

    class child1 extends Parents {
        void Properties2() {
            /*
             * double BankBalance = 19874568;
             * 
             */
            System.out.println("This is child class");

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