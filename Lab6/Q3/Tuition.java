public class Tuition {
  public static void main(String[] args) {
    FullTime fullTimeStudent = new FullTime("Ali");
    PartTime partTimeStudent = new PartTime("Abu");

    fullTimeStudent.fees();
    partTimeStudent.fees();
  }
}
