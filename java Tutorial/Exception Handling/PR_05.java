class A extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(" java can supports abstract classes and methods  ");
                Thread.sleep(1000);

                Thread.yield();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PR_05 {
    public static void main(String[] args) throws InterruptedException {
        A ref = new A();
        ref.start();

        for (int i = 1; i < 5; i++) {
            System.out.println(" C++ also Objects Oriented Programming Language  ");

            Thread.sleep(1000);

            if (i == 3) {
                System.out.println("Stopping Thread A");
                ref.stop();
            }

        }
    }
}
