public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double getLargeDiagonal() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
