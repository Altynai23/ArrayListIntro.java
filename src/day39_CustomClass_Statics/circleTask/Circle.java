package day39_CustomClass_Statics.circleTask;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter;
    //public static double PI = 3.14; // only one copy of static variables will bw shared by all circle object

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    public double perimeter(){
        return diameter * Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area() ) +
                ", perimeter=" + df.format(perimeter() ) +
                '}';
    }
}
