package by.tut.lect8;

public class Circle extends GeometricFigure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double square() {
        System.out.println("Площадь окружности: ");
        double squareCir = Math.pow(getRadius(), 2) * getPi();
        return squareCir;
    }

    @Override
    public double perimeter() {
        System.out.println("Длина окружности: ");
        double lengthCircle = 2 * getPi() * getRadius();
        return lengthCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equalAreas(GeometricFigure figure) {
        if (figure.square() == square()) {
            return true;
        }
        return false;
    }
}
