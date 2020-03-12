package by.tut.lect8;

public class Rhombus extends GeometricFigure{
    private int x;
    private int h;

    public Rhombus(int x, int h) {
        this.x = x;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public int getH() {
        return h;
    }

    @Override
    public double square() {
        System.out.println("Площадь ромба равна: ");
        return getX() * getH();
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр ромба равен: ");
        return getX() * 4;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "x=" + x +
                ", h=" + h +
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
