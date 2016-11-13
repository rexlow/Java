public class FullTime extends Student {
  public FullTime(String name) {
    super();
    this.name = name;
    this.fullTimeStatus = true;
  }

  @Override
  public void fees() {
    System.out.println(name + " is a full time student and he is paying $2000.");
  }
}
