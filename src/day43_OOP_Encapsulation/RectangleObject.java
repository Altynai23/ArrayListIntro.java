package day43_OOP_Encapsulation;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(-1, -3);


        //System.out.println(r1);

        r1.setLength(5);
        r1.setWidth(6);

        System.out.println(r1);

        Rectangle r2 = new Rectangle(6, 5);
        System.out.println(r2);

        System.out.println(r1.equals(r2));


    }



}
