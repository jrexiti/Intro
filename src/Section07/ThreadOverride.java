package Section07;


public class ThreadOverride extends Thread {

    @Override
    public void run() {
        System.out.println("This thread is running");
    }

}
