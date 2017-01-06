import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("destination.dat");
      int n1 = fis.read();
      int n2 = fis.read();
      int total = n1 + n2;
      System.out.println(total);
      System.out.println("Done");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
