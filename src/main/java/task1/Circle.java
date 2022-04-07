package task1;

public class Circle implements Figure2D{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        double s = Math.PI * Math.pow(radius, 2.0);
        return s;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
