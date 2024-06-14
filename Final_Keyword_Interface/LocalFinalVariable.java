class LocalFinalVariable {
    public static void main(String[] args) {
        final int x = 50;
        // x = x+10; It is not possible because of final keyword
        System.out.println(x);
        final LocalFinalVariable l = new LocalFinalVariable();
    }
}
