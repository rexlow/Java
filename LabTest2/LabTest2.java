import java.util.*;

public class LabTest2 {

    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Permanent");
    System.out.println("2 - PartTime");
    System.out.print("Are you a Permanent staff or PartTime staff: ");

    int staffOption = scanner.nextInt();

    if (staffOption == 1) {
      Permanent newStaff = new Permanent();
      newStaff.Register();
      newStaff.salaryCal();
      newStaff.Show();
    } else {
      PartTime newStaff = new PartTime();
      newStaff.Register();
      newStaff.salaryCal();
      newStaff.Show();
    }


  }

}
