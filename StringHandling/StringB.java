public class StringB {
    public static void main(String... s) {
        StringBuffer sb = new StringBuffer();
        // StringBuffer sb = new StringBuffer(20);
        // StringBuffer sb = new StringBuffer("AppSuadz");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuffer sb1 = sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("After Append");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("q");

        System.out.println("After second append");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

}
