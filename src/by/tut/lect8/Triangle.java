package by.tut.lect8;

public class Triangle extends GeometricFigure{
    private int a;

    public Triangle(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public double square() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public boolean equalAreas(GeometricFigure figure) {
        if (figure.square() == square()) {
            return true;
        }
        return false;
    }

    public static class EquilateralTriangle extends Triangle { ///////равносторонний треугольник
        private int h;

        public EquilateralTriangle(int a, int h) {
            super(a);
            this.h = h;
        }

        public int getH() {
            return h;
        }


        @Override
        public double square() {
            System.out.println("Площадь равностороннего треугольника: ");
            return getH() * getA() * 0.5;
        }

        @Override
        public double perimeter() {
            System.out.println("Периметр равностороннего треугольника: ");
            return getA() * 3;
        }

        @Override
        public boolean equalAreas(GeometricFigure figure) {
            return super.equalAreas(figure);
        }
    }

    public static class IsoscelesTriangle extends Triangle { //////равнобедренный
        private int b;
        private int h;

        public IsoscelesTriangle(int a, int b, int h) {
            super(a);
            this.b = b;
            this.h = h;
        }

        public int getB() {
            return b;
        }

        public int getH() {
            return h;
        }

        @Override
        public double square() {
            System.out.println("Площадь равнобедренного треугольника: ");
            return getB() * getH() * 0.5;
        }

        @Override
        public double perimeter() {
            System.out.println("Периметр равнобедренного треугольника: ");
            return Math.pow(getA(), 2) + getB();
        }

        @Override
        public boolean equalAreas(GeometricFigure figure) {
            return super.equalAreas(figure);
        }
    }

    public static class RectangularTriangle extends Triangle implements AreasEqual {
        private int b;
        private int c;

        public RectangularTriangle(int a, int b, int c) {
            super(a);
            this.b = b;
            this.c = c;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        @Override
        public double square() {
            System.out.println("Площадь прямоугольного треугольника: ");
            return getA() * getB() * 0.5;
        }

        @Override
        public double perimeter() {
            System.out.println("Периметр прямоугольного треугольника: ");
            return getA() + getB() + getC();
        }

        @Override
        public boolean equalAreas(GeometricFigure figure) {
            return super.equalAreas(figure);
        }
    }
}
