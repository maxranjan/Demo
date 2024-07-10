class Thread1 extends Thread {
    Shared s;

    Thread1(String str, Shared s) {
        super(str);
        this.s = s;
        start();
    }

    public void run() {
        System.out.println(s.withdraw());
    }
}

class Thread2 extends Thread {
    Shared s;

    Thread2(String str, Shared s) {
        super(str);
        this.s = s;
        start();
    }

    public void run() {
        s.submit();
    }
}