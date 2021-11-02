public class Square extends Quadrangle implements Figure {

    public Square(int a, int b, String color) {
        super(a, b, color);
        b = a;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
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
}
