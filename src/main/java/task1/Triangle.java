package task1;

public class Triangle implements Figure2D{
    double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    @Override
    public double area() {
        double p = (a + b +c) / 2;
        double s = Math.pow((p * (p - a) * (p - b) * (p - c)), 0.5);
        return s;
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }
}
