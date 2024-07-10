import javax.swing.*;
import java.awt.*;
public class ShutdownHooks implements Runnable {
    public void run() {
        System.out.println("*** APPLICATION SHUTING DOWN ***");
        ShutDownHooks1 hook = new ShutDownHooks1();
        Thread t1 = new Thread(hook);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        System.out.println("******** Aftet Backup *********");

    }
}

class ShutDownHooks1 implements Runnable {
    public void run() {
        System.out.println("Taking backing up and closing resources");
        try {
            Thread.sleep(1000 * 5);
        } catch (Exception e) {
        }

    }
}

class RunHookUp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        ShutdownHooks hook = new ShutdownHooks();

        // Register the Shutdown Hook
        runtime.addShutdownHook(new Thread(hook));

        JFrame testFrame = new JFrame("Test Frame");
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(400, 400);
        testFrame.setVisible(true);
        System.out.println("Hello");

    }
}