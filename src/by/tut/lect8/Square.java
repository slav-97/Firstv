package by.tut.lect8;

public class Square extends GeometricFigure implements DiagonalSearch{
    private int x;

    public Square(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @Override
    public double square() {
        System.out.println("Площадь квадрата равна: ");
        return Math.pow(getX(), 2);
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр квадрата равен: ");
        return getX() * 4;
    }

    @Override
    public double diagonalLength() {
        System.out.println("Диагональ квадрата равна: ");
        return Math.sqrt(2) * getX();
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
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
