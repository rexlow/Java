public class PartTime extends Student {
  public PartTime(String name) {
    super();
    this.name = name;
    this.fullTimeStatus = false;
  }

  @Override
  public void fees() {
    System.out.println(name + " is a full time student and he is paying $200 per credit hour.");
  }
}
