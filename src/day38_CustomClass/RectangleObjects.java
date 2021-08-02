package day38_CustomClass;

public class RectangleObjects {

    public static void main(String[] args) {
        // w:20, l:30
        Rectangle rectangle1 = new Rectangle();
        /*
        rectangle1.width = 30;
        rectangle1.length = 20;
        */
        rectangle1.setInfo( 30, 20);

        rectangle1.getInfo();

        System.out.println("---------------------------------------------");
        // l:50, w:10
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(50, 10);

        rectangle2.getInfo();




    }
}
