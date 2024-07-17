import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bstream {
    public static void main(String[] args) {
        String srcFile = "rabri.txt";
        try (BufferedInputStream bs = new BufferedInputStream(new FileInputStream(srcFile))) {
            byte byteData;
            while ((byteData = (byte) bs.read()) != -1) {
                System.out.println((char) byteData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
