public class GetChar {
    public static void main(String[] args) {
        String Str1 = new String("Welcome to the tutorial of string");
        char[] Str2 = new char[7];
        char c[] = Str1.toCharArray();
        try {
            Str1.getChars(2, 9, Str2, 0);
            System.out.print("Coppied Value =");
            for (int i = 0; i < Str2.length; i++)
                System.out.print(Str2[i]);
            System.out.println("");

            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
            }

        } catch (Exception ex) {
            System.out.println("Raised Exception");
        }
    }

}
