import java.util.*;

public class Permanent extends Staff {

  Scanner scanner = new Scanner(System.in);

  public int overtime;
  int overtimeHour;
  double monthlySalary;
  final public int overtimeRate = 75;
  public String stafID;

  public Permanent() {

  }

  public void Register() {
    System.out.println("Please enter all the credentials below.");

    System.out.print("Name          : ");
    name = scanner.next();

    System.out.print("IC            : ");
    ic = scanner.next();

    System.out.print("StafID        : ");
    stafID = scanner.next();

    System.out.print("Monthly Salary: ");
    monthlySalary = scanner.nextDouble();

    System.out.println("Do you work overtime?");
    System.out.println("If yes, please enter overtime hour.");
    System.out.println("If no, please enter 0.");
    overtimeHour = scanner.nextInt();
  }

  @Override
  public void Show() {
    System.out.println("Hello Permenant Staff: " + name);
    System.out.println("IC                   : " + ic);
    System.out.println("StafID               : " + ic);
    System.out.println("Total overtime hour  : " + overtimeHour + " hours");
    System.out.println("Total salary         : RM  " + salary);
  }

  @Override
  public void salaryCal() {
    salary = monthlySalary + overtimeHour*overtimeRate;
  }
}
