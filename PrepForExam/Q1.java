class A {
  public void print() {
    System.out.println("hi");
  }
}

class B extends A {
  public void print() {
    System.out.println("bye");
  }
}

class Q1 {
  public static void main(String[] args) {
    A a = new B();
    a.print();
  }
}
