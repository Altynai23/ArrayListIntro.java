package day46_Inheritance.shapeTask;

public class Circle extends Shape{

    public double radius, diameter;
    public final double PI = 3.14;

    public Circle(String name, double radius, double diameter) {
        super(name);
        this.radius = radius;
        this.diameter = diameter;
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






}
