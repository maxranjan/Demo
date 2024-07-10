class Thread1 implements Runnable {

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println(Thread.currentThread().getName() + "Dead - 111");
    }

}

class GroupThread {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Hello");

        Thread1 t1 = new Thread1();
        Thread t3 = new Thread(tg, t1, "Thread-1");
        Thread t4 = new Thread(tg, t1, "Thread-2");
        Thread t5 = new Thread(tg, t1, "Thread-3");

        t3.start();
        t4.start();
        t5.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName());
        tg.stop();
    }

}
