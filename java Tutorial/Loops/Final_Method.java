public class Final_Method {

    void Mnumber() {
        System.out.println("8103101675");
    }

    void atmPIN() {
        System.out.println("1675");
    }

}

class Theif extends Final_Method {
    @Override
    void Mnumber() {
        System.out.println("8103101675");
    }

    @Override
    void atmPIN() {
        System.out.println("1675");
    }

    class Final_Method()
    {

        public static void main(String[] args) {
            Theif T1 = new Theif();
            T1.Mnumber();
            T1.atmPIN();

        }
    }

}