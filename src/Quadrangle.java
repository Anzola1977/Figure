public abstract class Quadrangle {
    int a, b;
    String color;

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public abstract double getLargeDiagonal();

    public abstract double getHeight();

    public abstract String getColor();

    public static void main(String[] args) {
        Square square = new Square(2, "red");
        Rectangle rectangle = new Rectangle(2, 3, "black");
        Rhombuses rhombuses = new Rhombuses(2, "white", 35, 145);
        Parallelogram parallelogram = new Parallelogram(2,3, "green", 35, 145);

        System.out.println(square.perimeter());
        System.out.println(rectangle.getLargeDiagonal());
        System.out.println(rhombuses.getHeight());
        System.out.println(parallelogram.area());
    }
}
