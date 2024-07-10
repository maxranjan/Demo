class RunSync {
    public static void main(String s[]) {
        Shared st = new Shared();
        CustomThread t1 = new CustomThread(st, "One");
        CustomThread1 t2 = new CustomThread1(st, "Two");
        CustomThread2 t3 = new CustomThread2(st, "Three");

    }
}