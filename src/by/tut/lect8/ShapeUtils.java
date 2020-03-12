package by.tut.lect8;

public class ShapeUtils {
    public boolean isTriangle(GeometricFigure gf) {
        return gf.getClass() == Triangle.class;
    }

    public boolean isRectangle(GeometricFigure gf) {
        return gf.getClass() == Rectangle.class;
    }
}
