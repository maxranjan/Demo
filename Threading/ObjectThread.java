class Thread1 extends Thread {
    Thread1(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            //System.out.println(Thread.currentThread().getName());
            System.out.println("Jai Shree Ram !! Har Har Mahadev");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
           
        }
        System.out.println(getName() + " Dead");
    }
}

/**
 * ObjectThread
 */
public class ObjectThread {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread 1");
        Thread1 t2 = new Thread1("Thread 2");
        Thread1 t3 = new Thread1("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        for (int i = 1; i <= 8; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
           

        }
        System.out.println(Thread.currentThread().getName() + " Dead ");
    }
}