class A extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("HTML is Hypertext Markup Language ");
                Thread.sleep(1000);

                // Introducing yield to allow other threads to run
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
            System.out.println("Java is Object Oriented Programming Language ");

            // Introducing sleep to simulate some processing time
            Thread.sleep(1000);

            // Introducing stop to demonstrate, but note that it's not recommended
            if (i == 3) {
                System.out.println("Stopping Thread A");
                ref.stop();
            }
        }
    }
}



    
    
        
    


    
    
    
        
        
    
