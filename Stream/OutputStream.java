import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("destination.dat");
      fos.write(3);
      fos.write(4);
      fos.write(5);
      System.out.println("Done");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
