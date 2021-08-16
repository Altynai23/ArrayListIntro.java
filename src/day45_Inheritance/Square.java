package day45_Inheritance;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side < 0){
            return;
        }
        this.side = side;
    }

    public double area(){
        return side * side ;
    }

    public double perimeter(){
        return 4 * side;
    }

    public boolean equals(Square square){
        return side == square.getSide();
    }

    public String toString() {
        return "Square{" +
                "side= " + getSide() +
                "area= " + area() +
                "perimeter= " + perimeter() +
                '}';
    }


}
