public class Interface {
  public static void main(String args[]) {
    SuperClass sc = new SuperClass();
    sc.getNo();
    sc.getNo2();

    SubClass sub = new SubClass();
    sub.getNo2();
  }
}

public interface ExampleInterface{
   public void do();
   public String doThis(int number);
}

public class sub implements ExampleInterface{
    public void do(){
      //specify what must happen
    }

    public String doThis(int number){
      //specfiy what must happen
    }
}

class SuperClass {
  public int getNo() {
    return 1;
  }

  public int getNo2() {
    return 2;
  }
}

class SubClass extends SuperClass {
  // override the implementation
  @Override
  public int getNo2() {
    return 3;
  }
}
