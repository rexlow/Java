import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("destination.dat");
      fos.write(3);
      System.out.println("Done");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
