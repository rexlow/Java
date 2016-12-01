import java.util.*;

public class PartTime extends Staff implements Rate {

  Scanner scanner = new Scanner(System.in);

  public int hour;
  public double rate = 0;
  public String ptName;
  public String qualification;

  public PartTime() {

  }

  public void Register() {
    System.out.println("Please enter all the credentials below.");
    System.out.print("Name                           : ");
    ptName = scanner.next();

    System.out.print("Qualification(SPM/STPM/DIPLOMA): ");
    qualification = scanner.next();

    System.out.print("Working hour                   : ");
    hour = scanner.nextInt();
  }

  @Override
  public void Show() {
    System.out.println("Hello PartTime Staff: " + ptName);
    System.out.println("Total working hour  : " + hour + " hours");
    System.out.println("Total salary         : RM  " + salary);
  }

  @Override
  public void salaryCal() {

    switch (qualification) {
      case "SPM":
          rate = SPM;
          break;
      case "STPM":
          rate = STPM;
          break;
      case "DIPLOMA":
          rate = DIPLOMA;
          break;
      default:
          break;
    }
    salary = hour*rate;
  }
}
