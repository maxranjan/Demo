
class Temp{
    static int x;
    static 
    {
        x = readInt();
    }
    public static void main(String[] args) {
        System.out.println("main");
    }
    }
    
    class Temp1{
        public static void main(String[] args) {
            System.out.println(Temp.x);
            System.out.println(Temp.x);
            Temp.x=40;
        }
    }
    
    class Temp2{
        public static void main(String[] args) {
            System.out.println(Temp.x);
        }
    }