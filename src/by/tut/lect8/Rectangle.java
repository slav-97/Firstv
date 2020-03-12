package by.tut.lect8;

public class Rectangle extends GeometricFigure implements DiagonalSearch{
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public double square() {
        System.out.println("Площадь прямоугольника: ");
        double squareRec = getX() * getY();
        return squareRec;
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр прямоугольника: ");
        return getX() * 2 + getY() * 2;
    }


    @Override
    public double diagonalLength() {
        System.out.println("Длина диагонали равна: ");
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
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
