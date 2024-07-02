class Thread1 extends Thread {
    Thread1(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
        System.out.println("Thread 1 - End");
    }
}

class Thread2 extends Thread {
    Thread2(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
        System.out.println("Threads 2 - End");
    }
}

class Thread3 extends Thread {
    Thread3(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
        System.out.println("Thread 3 - End");
    }
}

class RunThread1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread 1");
        Thread1 t2 = new Thread1("Thread 2");
        Thread1 t3 = new Thread1("Thread 3");

        t1.run();
        t2.run();
        t3.run();
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