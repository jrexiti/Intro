package JAVABasics;

public class L22_ThreadImplements implements Runnable {

    public static void main(String[] args) {

        L22_ThreadImplements thread = new L22_ThreadImplements();
        Thread threadObject = new Thread(thread);
        threadObject.start();

        System.out.println("Outside of a thread");
        System.out.println(Thread.currentThread().getName());

    }

    public void run() {
        System.out.println("Inside of a thread");
        System.out.println(Thread.currentThread().getName());

    }

}
