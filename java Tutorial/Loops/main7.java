// 2. Unchecked Expemtion > Runtime  
class Demo1 extends Thread {

    public void run() {
        try {
            sleep(60000); // 1 Muanat

        } catch (InterruptedException e) {
        }
        System.out.println("Hellow");

    }
}

public class main7 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.start();

    }
}