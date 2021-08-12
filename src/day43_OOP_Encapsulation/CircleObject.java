package day43_OOP_Encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(-1);

        System.out.println(circle1);

        circle1.setRadius(3);

        System.out.println(circle1);

        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());

        Circle circle2 = new Circle(5);

        System.out.println( circle1.equals(circle2));
        System.out.println( circle1 == circle2);



    }

}
