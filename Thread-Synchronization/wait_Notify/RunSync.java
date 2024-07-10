class RunSync {
    public static void main(String[] args) {
        Shared st = new Shared();
        Thread1 t1 = new Thread1("One", st);
        Thread2 t2 = new Thread2("Two", st);

    }
}