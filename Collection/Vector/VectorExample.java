import java.util.*;

public class VectorExample {
  public static void main(String[] args) {

    Vector<String> vector = new Vector<String>(2);

    vector.addElement("Apple");
    vector.addElement("Orange");
    vector.addElement("Mango");
    vector.addElement("Fig");

    System.out.println("Size: " + vector.size());
    System.out.println("Default capacity increment: " + vector.capacity());

    vector.addElement("fruit1");
    vector.addElement("fruit2");
    vector.addElement("fruit3");

    System.out.println("Size after addition: " + vector.size());
    System.out.println("Capacity after increment is: " + vector.capacity());

    //test the meaning of capacity
    vector.addElement("Special fruit1");
    vector.addElement("Special fruit2");
    vector.addElement("Special fruit3");
    vector.addElement("Special fruit4");
    vector.addElement("Special fruit5");
    System.out.println("Size after special addition: " + vector.size());
    System.out.println("Capacity after special increment is: " + vector.capacity());

    /*Display Vector elements*/
    Enumeration enumeration = vector.elements();
    System.out.println("\nElements are:");
    while(enumeration.hasMoreElements())
       System.out.print(enumeration.nextElement() + " ");
  }

}
