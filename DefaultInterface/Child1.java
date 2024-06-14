interface my{
// If we use static member function then we do not need to implement. We can access with class name. 
    static void show(){
        System.out.println("This is the My");
    }
}
// we cannot inherit static method in interface.
class Child1 {
    
    public static void main(String[] args) {
    my.show();
}
}