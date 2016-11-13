public class Triangle extends GeometricFigure implements Sides{
  public Triangle(double height, double width) {
    super();
    this.type = "Triangle";
    this.sides = 3;
    this.height = height;
    this.width = width;
  }

  public int printSide() {
    return sides;
  }

  @Override
  public void figureArea() {
    area = height*width/2;
    System.out.println(type + " has the area of " + area + " with " + printSide() + " sides.");
  }
}
