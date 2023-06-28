package JAVA_Basics;

public class ThreadOverride extends Thread {

    @Override
    public void run() {
        System.out.println("This thread is running");

        for (int i = 10; i > 0; i--) {
            System.out.println(currentThread().getName() + ": \n" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
