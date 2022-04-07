package task1;

public class Rectangular implements Figure2D {
    private double a, b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double s = a * b;
        return s;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
