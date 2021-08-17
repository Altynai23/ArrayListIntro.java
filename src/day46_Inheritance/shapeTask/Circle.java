package day46_Inheritance.shapeTask;

public class Circle extends Shape{ // Circle Is A shape

    public double radius, diameter;
    public final static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
        setDiameter(radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <0){
            return;
        }
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter < 0){
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }

    public double area() {
        return radius * radius * PI;
    }


    public double perimeter() {
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                super.toString()+
                '}';
    }
}
