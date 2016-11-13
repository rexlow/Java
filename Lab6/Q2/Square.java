public class Square extends GeometricFigure implements Sides{
  public Square(double height, double width) {
    super();
    this.type = "Square";
    this.sides = 4;
    this.height = height;
    this.width = width;
  }

  public int printSide() {
    return sides;
  }

  @Override
  public void figureArea() {
    area = height*width;
    System.out.println(type + " has the area of " + area + " with " + printSide() + " sides.");
  }
}
