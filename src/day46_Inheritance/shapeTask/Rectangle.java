package day46_Inheritance.shapeTask;

public class Rectangle extends Shape{
        //          10      20
    public double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <0){
            return;
        }
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length+width) * 2;
    }






}
