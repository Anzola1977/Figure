public class Parallelogram extends Quadrangle implements Figure {
    double alpha, beta;

    public Parallelogram(int a, int b, String color, double alpha, double beta) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
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
