package day43_OOP_Encapsulation;

public class Circle {
    //                5       20
    private double radius, diameter;

    private static double PI = 3.14;

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setRadius(double radius){
        if (radius < 0){
            System.out.println("Radius can not be negative");
            return;
        }
        this.radius = radius;//r=3
        setDiameter(radius* 2);
                        //10
    }
    public void setDiameter(double diameter){
        if (diameter < 0) {
            System.out.println("Diameter of the circle can not be negative");
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }


    public Circle(double radius) {
        setRadius(radius);
    }


    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
