public class Square extends GeometricFigure {
  public Square(double height, double width) {
    super();
    this.type = "Square";
    this.height = height;
    this.width = width;
  }

  @Override
  public void figureArea() {
    area = height*width;
    System.out.println(type + " has the area of " + area);
  }
}
