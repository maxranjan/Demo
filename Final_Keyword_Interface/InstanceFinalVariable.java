 class InstanceFinalVariable {
    final int x = 20;
    public static void main(String[] args) {
        InstanceFinalVariable a =new InstanceFinalVariable();
        System.out.println(a.x);
        InstanceFinalVariable a1 = new InstanceFinalVariable();
        System.out.println(a1.x);
    }    
}
// We cannot change  value of instance variable if they are final.