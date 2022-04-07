package task1;

public class PrismTask {
    public static void main (String[] args){
        Triangle();
    }

    public static void Triangle() {
        Figure2D Triangle = new Triangle(3, 4, 5);
        Prism prism1 = new Prism(Triangle, 25);

        Figure2D Circle = new Circle(5);
        Prism prism2 = new Prism(Circle, 10);

        Figure2D Ractangular = new Rectangular(7, 5);
        Prism prism3 = new Prism(Ractangular, 25);

        Figure2D Trapezoid = new Trapezoid(10, 4, 13, 14);
        Prism prism4 = new Prism(Triangle, 14);





        System.out.println(prism1.volume());
        System.out.println(prism2.volume());
        System.out.println(prism3.volume());
        System.out.println(prism4.volume());






    }




}
