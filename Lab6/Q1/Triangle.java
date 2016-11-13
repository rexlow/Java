public class Triangle extends GeometricFigure {
  public Triangle(double height, double width) {
    super();
    this.type = "Triangle";
    this.height = height;
    this.width = width;
  }

  @Override
  public void figureArea() {
    area = height*width/2;
    System.out.println(type + " has the area of " + area);
  }
}
