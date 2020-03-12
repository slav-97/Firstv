package by.tut.lect8;

public class Busya08 {
    public static void main(String[] args) {
        GeometricFigure[] figures = {new Circle(3), new Rectangle(3, 4), new Rhombus(3, 2),
                new Triangle.EquilateralTriangle(2, 1), new Triangle.IsoscelesTriangle(4, 2, 7),
                new Triangle.RectangularTriangle(3, 4, 5)};

        for (GeometricFigure figure : figures) {
            System.out.println("Периметр: " + figure.perimeter());
            System.out.println("Площадь:  " + figure.square());
        }
        System.out.println("Равны ли площади: " + new Triangle.RectangularTriangle(3, 4, 5).equalAreas(new Rectangle(3, 2)));
        ShapeUtils su = new ShapeUtils();
        System.out.println(su.isRectangle(new Triangle(2)));
        System.out.println(su.isTriangle(new Rectangle(2, 3)));
    }
}
