package day41_CustomClass_Constructor.circleTask;

public class Circle {

    public double radius;
    public double diameter;

    public static double PI;

    static{
        PI = 3.14;
    }

    public Circle(double radius){
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double area(){
        return radius* radius * PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ",area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
