package Section07;

public class L23_ThreadOrdering {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            new Thread("Thread " + i + ": ") {
                public void run() {
                    System.out.println(getName() + " running");
                }
            }
                    .start();
        }
    }
}
